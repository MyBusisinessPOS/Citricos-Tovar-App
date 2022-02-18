package com.solucinestpvpos.citricostovar.api.remoto

import com.google.gson.annotations.SerializedName

class ClientsResult {

    @SerializedName("id"         ) var id        : Int?    = null
    @SerializedName("name"       ) var name      : String? = null
    @SerializedName("code"       ) var code      : Int?    = null
    @SerializedName("email"      ) var email     : String? = null
    @SerializedName("country"    ) var country   : String? = null
    @SerializedName("city"       ) var city      : String? = null
    @SerializedName("phone"      ) var phone     : String? = null
    @SerializedName("adresse"    ) var adresse   : String? = null
    @SerializedName("created_at" ) var createdAt : String? = null
    @SerializedName("updated_at" ) var updatedAt : String? = null
    @SerializedName("deleted_at" ) var deletedAt : String? = null
}