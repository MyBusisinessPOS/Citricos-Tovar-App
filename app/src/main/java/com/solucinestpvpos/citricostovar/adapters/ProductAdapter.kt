package com.solucinestpvpos.citricostovar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.request.ImageRequest
import coil.transform.BlurTransformation
import com.solucinestpvpos.citricostovar.R
import com.solucinestpvpos.citricostovar.api.remoto.ProductsResult
import com.solucinestpvpos.citricostovar.interfaces.Constants

class ProductAdapter(val context: Context , val mData: ArrayList<ProductsResult>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        val textviewProduct : TextView = view.findViewById(R.id.textView_list_products_articulo_view)
        val textviewExistencia : TextView = view.findViewById(R.id.textView_list_products_existencia_view)
        val textviewPrice : TextView = view.findViewById(R.id.textView_list_products_price_one_view)
        val textviewDescrip : TextView = view.findViewById(R.id.textView_list_products_descripcion_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        val data = mData
        holder.apply {
            textviewProduct.text = data[position].code
            textviewExistencia.text = data[position].stockAlert.toString()
            textviewPrice.text = data[position].price.toString()
            textviewDescrip.text = data[position].name
        }
    }

    override fun getItemCount(): Int = mData.size
}