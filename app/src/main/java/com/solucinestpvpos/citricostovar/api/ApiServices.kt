package com.solucinestpvpos.citricostovar.api

import com.solucinestpvpos.citricostovar.api.remoto.Products
import retrofit2.Call
import retrofit2.http.GET


interface ApiServices{

    @GET("api/Products")
    fun getProducts(): Call<Products>

}