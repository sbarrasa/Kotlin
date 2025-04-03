package com.sbarrasa.bank.product

abstract class SimpleProduct(val id: String, val name: String) {
    val isCreditProduct = this is CreditProduct
    open fun description() = name
}