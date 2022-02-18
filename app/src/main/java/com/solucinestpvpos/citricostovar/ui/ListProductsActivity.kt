package com.solucinestpvpos.citricostovar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.solucinestpvpos.citricostovar.R
import com.solucinestpvpos.citricostovar.adapters.ProductAdapter
import com.solucinestpvpos.citricostovar.databinding.ActivityListProductsBinding
import com.solucinestpvpos.citricostovar.viewmodels.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_list_products.*


@AndroidEntryPoint
class ListProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListProductsBinding

    private val productViewModel: ProductViewModel by viewModels()
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_list_products)

        binding = ActivityListProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        productViewModel.getAllProducts()
        getData()
    }

    private fun getData() {
        productViewModel.getProducts().observe(this, Observer {

            if (it == null) {
                return@Observer
            }

            productAdapter = ProductAdapter(this, ArrayList(it))
            rv_product_list.setHasFixedSize(true)
            rv_product_list.layoutManager = LinearLayoutManager(this)
            rv_product_list.adapter = productAdapter
        })

    }


}