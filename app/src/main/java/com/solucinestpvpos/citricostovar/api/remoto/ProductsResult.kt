package com.solucinestpvpos.citricostovar.api.remoto

import com.google.gson.annotations.SerializedName

class ProductsResult {

    @SerializedName("id"               ) var id             : Int?    = null
    @SerializedName("code"             ) var code           : String? = null
    @SerializedName("Type_barcode"     ) var TypeBarcode    : String? = null
    @SerializedName("name"             ) var name           : String? = null
    @SerializedName("cost"             ) var cost           : Int?    = null
    @SerializedName("price"            ) var price          : Int?    = null
    @SerializedName("category_id"      ) var categoryId     : Int?    = null
    @SerializedName("brand_id"         ) var brandId        : Int?    = null
    @SerializedName("unit_id"          ) var unitId         : Int?    = null
    @SerializedName("unit_sale_id"     ) var unitSaleId     : Int?    = null
    @SerializedName("unit_purchase_id" ) var unitPurchaseId : Int?    = null
    @SerializedName("TaxNet"           ) var TaxNet         : Int?    = null
    @SerializedName("tax_method"       ) var taxMethod      : String? = null
    @SerializedName("image"            ) var image          : String? = null
    @SerializedName("note"             ) var note           : String? = null
    @SerializedName("stock_alert"      ) var stockAlert     : Int?    = null
    @SerializedName("is_variant"       ) var isVariant      : Int?    = null
    @SerializedName("is_active"        ) var isActive       : Int?    = null
    @SerializedName("created_at"       ) var createdAt      : String? = null
    @SerializedName("updated_at"       ) var updatedAt      : String? = null
    @SerializedName("deleted_at"       ) var deletedAt      : String? = null
}