package com.solucinestpvpos.citricostovar.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.solucinestpvpos.citricostovar.R
import com.solucinestpvpos.citricostovar.adapters.ClientAdapter
import com.solucinestpvpos.citricostovar.adapters.ProductAdapter
import com.solucinestpvpos.citricostovar.databinding.ActivityListClientsBinding
import com.solucinestpvpos.citricostovar.databinding.ActivityListProductsBinding
import com.solucinestpvpos.citricostovar.utils.exchangeView
import com.solucinestpvpos.citricostovar.viewmodels.ClientViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_list_clients.*
import kotlinx.android.synthetic.main.activity_list_products.*

@AndroidEntryPoint
class ListClientsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListClientsBinding

    private val clientViewModel : ClientViewModel by viewModels()
    private lateinit var clientAdapter: ClientAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListClientsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clientViewModel.getAllClients()
        getClients()
        addClient()
    }

    private fun getClients(){
        clientViewModel.getClients().observe(this, Observer {

            if (it == null){
                exchangeView(layoutProgressClients, rv_clients_list )
                return@Observer
            }

            clientAdapter = ClientAdapter(this, ArrayList(it))
            rv_clients_list.setHasFixedSize(true)
            rv_clients_list.layoutManager = LinearLayoutManager(this)
            rv_clients_list.adapter = clientAdapter
            exchangeView(rv_clients_list, layoutProgressClients)


        })
    }

    private fun addClient(){
        fab_add_clients.setOnClickListener {
            val intent = Intent(this, RegisterClientActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}