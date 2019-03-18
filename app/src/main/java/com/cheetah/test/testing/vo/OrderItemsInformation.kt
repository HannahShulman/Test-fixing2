package com.cheetah.test.testing.vo

import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class OrderItemsInformation (
    @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("quantity")
    @Expose
    var quantity: Int? = 0,
    @SerializedName("product_id")
    @Expose
    var productId: Int? = null,
    @SerializedName("sub_total")
    @Expose
    var subTotal: Int? = null,
    @SerializedName("order_id")
    @Expose
    var orderId: Int? = null,
    @SerializedName("packaging_type")
    @Expose
    var packagingType: String? = null,
    @SerializedName("substitutable")
    @Expose
    var substitutable: Boolean? = null,
    @SerializedName("product")
    @Expose
    var product: Product? = null
)
