package com.solucinestpvpos.citricostovar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.solucinestpvpos.citricostovar.R
import com.solucinestpvpos.citricostovar.api.remoto.ClientsResult

class ClientAdapter(val context: Context, val data : ArrayList<ClientsResult>) : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val textviewCode : TextView = view.findViewById(R.id.textView_list_clients_client_view)
        val textviewName : TextView = view.findViewById(R.id.textView_list_clients_name_view)
        val textviewPhone : TextView = view.findViewById(R.id.textView_list_clients_phone_view)
        val textviewEmail : TextView = view.findViewById(R.id.textView_list_clients_email_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_client, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mData = data
        holder.apply {
            textviewCode.text = mData[position].code.toString()
            textviewName.text = mData[position].name
            textviewPhone.text = mData[position].phone
            textviewEmail.text = mData[position].email
        }
    }

    override fun getItemCount(): Int = data.size
}