package com.sbarrasa.bank.product

abstract class Card(id: String, name: String, val branch: Branch) : SimpleProduct(id, name) {
    override fun description() = "${super.description()} ${branch.description}"
}