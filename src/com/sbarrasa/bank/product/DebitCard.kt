package com.sbarrasa.bank.product

class DebitCard(branch: Branch): Card(ID, NAME, branch) {
    companion object{
        const val ID = "TD"
        const val NAME = "Tarjeta de débito"
    }
}