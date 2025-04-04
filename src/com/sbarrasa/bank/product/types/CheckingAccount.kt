package com.sbarrasa.bank.product.types

import com.sbarrasa.bank.product.registry.ProductRegister

class CheckingAccount : Account(CheckingAccount) {
    companion object : ProductRegister<CheckingAccount> {
        override val productType = "CA"
        override val name = "Caja de ahorro"
        override val creator = ::CheckingAccount
    }
}