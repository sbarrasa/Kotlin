package com.sbarrasa.bank.product

class CreditCard(branch: Branch): Card(ID, NAME, branch), CreditProduct {
    override var creditLimit: Double? = null
    var tier: String? = null

    override fun description() = "${super.description()} ${tier ?: ""}".trimEnd()

    companion object {
        const val ID = "TC"
        const val NAME = "Tarjeta de crédito"
    }
}