package com.cheetah.test.testing.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cheetah.test.testing.vo.CustomerCart
import com.cheetah.test.testing.vo.OrderItemsInformation

@Database(entities = [CustomerCart::class, OrderItemsInformation::class] ,version = RoomDB.VERSION, exportSchema = false)
abstract class RoomDB: RoomDatabase() {

    abstract fun customerCartDao(): CustomerCartDao
    abstract fun orderedItemsDao(): OrderedItemsDao

    companion object {
        const val VERSION = 2
    }
}