package com.sbarrasa.bank.product

class SavingAccount(cbu: String, currency: Currency): Account(ID, NAME, cbu, currency), CreditProduct {
    override var creditLimit: Double? = null
    companion object {
        const val ID = "CC"
        const val NAME = "Cuenta corriente"
    }
}