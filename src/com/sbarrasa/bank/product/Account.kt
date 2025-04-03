package com.sbarrasa.bank.product
abstract class Account (id: String,
                        name: String,
                        val cbu: String,
                        val currency: Currency)
    : SimpleProduct(id, name) {
        override fun description() = "${super.description()} en $currency"
}