package com.solucinestpvpos.citricostovar.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solucinestpvpos.citricostovar.api.ApiServices
import com.solucinestpvpos.citricostovar.api.remoto.Products
import com.solucinestpvpos.citricostovar.api.remoto.ProductsResult
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(val apiServices: ApiServices) : ViewModel() {

    private val products = MutableLiveData<List<ProductsResult>>()

    fun getProducts(): LiveData<List<ProductsResult>> {
        return products;
    }

    fun getAllProducts(){

        apiServices.getProducts().enqueue(object : Callback<Products>{

            override fun onResponse(call: Call<Products>, response: Response<Products>) {
                if (!response.isSuccessful){
                    return
                }

                val remoteData = response.body();

                if (remoteData?.products != null){
                    val data = remoteData.products
                    products.postValue(data)
                }

            }

            override fun onFailure(call: Call<Products>, t: Throwable) {
               // products.postValue(null)
            }
        })
    }
}