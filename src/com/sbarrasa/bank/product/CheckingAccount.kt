package com.sbarrasa.bank.product

class CheckingAccount(cbu: String, currency: Currency): Account(ID, NAME, cbu, currency ) {
    companion object {
        const val ID = "CA"
        const val NAME = "Caja de ahorro"
    }
}