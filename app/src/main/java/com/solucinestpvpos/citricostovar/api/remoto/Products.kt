package com.solucinestpvpos.citricostovar.api.remoto

import com.google.gson.annotations.SerializedName

class Products {
    @SerializedName("products" ) var products : ArrayList<ProductsResult> = arrayListOf()
}