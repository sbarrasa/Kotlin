package com.sbarrasa.bank.product.registry

import com.sbarrasa.bank.product.Product
import com.sbarrasa.bank.product.ProductHeader

interface ProductRegister<T: Product>: ProductHeader {
    val creator: ProductCreator<T>
}