package com.sbarrasa.bank.product.types

import com.sbarrasa.bank.product.Branch
import com.sbarrasa.bank.product.Product
import com.sbarrasa.bank.product.ProductHeader

abstract class Card(header: ProductHeader): Product(header) {
    var branch: Branch? = null
    override fun description() = "${super.description()} ${branch?.description}"
}