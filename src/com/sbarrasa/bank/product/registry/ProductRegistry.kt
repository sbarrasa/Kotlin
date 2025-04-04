package com.sbarrasa.bank.product.registry

import com.sbarrasa.bank.product.Product


typealias ProductCreator<T> = () -> T

object ProductRegistry {
    private val creators = mutableMapOf<String, ProductCreator<out Product>>()

    fun <T : Product> register(productRegister: ProductRegister<T>):ProductRegistry {
        return register(productRegister.productType, productRegister.creator,)
    }

    fun <T : Product> register(productType: String,  creator: ProductCreator<T>):ProductRegistry {
        creators[productType] = creator
        return this
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : Product> create(productType: String): T? {
        return creators[productType]?.invoke() as? T
    }
}