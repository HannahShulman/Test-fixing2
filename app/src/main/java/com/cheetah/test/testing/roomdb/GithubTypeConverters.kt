package com.cheetah.test.testing.roomdb

import androidx.room.TypeConverter
import com.cheetah.test.testing.vo.OrderItemsInformation
import com.cheetah.test.testing.vo.Product
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


/**
 * This class is responsible for converting objects to primitives,
 * so that db can hold and provide back(convert back)as object
 */
object DatabaseTypeConverters {

    @TypeConverter
    @JvmStatic
    fun productToString(product: Product): String? {
        return Gson().toJson(product).toString()
    }


    @TypeConverter
    @JvmStatic
    fun StringtoProduct(product: String): Product? {
        return Gson().fromJson(product, Product::class.java)
    }


    @TypeConverter
    @JvmStatic
    fun orderItemListToString(list: List<OrderItemsInformation>): String? {
        return Gson().toJson(list).toString()
    }

    @TypeConverter
    @JvmStatic
    fun stringToOrderItemList(list: String): List<OrderItemsInformation>? {
        val listType = object : TypeToken<List<OrderItemsInformation>>() {
        }.type
        return Gson().fromJson(list, listType)
    }
}
