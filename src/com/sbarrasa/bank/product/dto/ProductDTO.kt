package com.sbarrasa.bank.product.dto

data class ProductDTO(val productType: String) {
    val attributes = HashMap<String, Any>()
}