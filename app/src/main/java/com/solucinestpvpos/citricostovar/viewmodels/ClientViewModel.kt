package com.solucinestpvpos.citricostovar.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solucinestpvpos.citricostovar.api.ApiServices
import com.solucinestpvpos.citricostovar.api.remoto.Clients
import com.solucinestpvpos.citricostovar.api.remoto.ClientsResult
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class ClientViewModel @Inject constructor(val apiServices: ApiServices) : ViewModel(){

    private val clients = MutableLiveData<List<ClientsResult>>()

    fun  getClients() : LiveData<List<ClientsResult>>{
        return clients
    }

    fun getAllClients(){

        apiServices.getClients().enqueue(object : Callback<Clients>{

            override fun onResponse(call: Call<Clients>, response: Response<Clients>) {

                if (!response.isSuccessful){
                    return
                }

                val remoteData = response.body()

                if (remoteData?.clients != null){
                    val data = remoteData.clients
                    clients.postValue(data)
                }
            }

            override fun onFailure(call: Call<Clients>, t: Throwable) {

            }

        })
    }

}