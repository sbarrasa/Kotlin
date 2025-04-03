package com.sbarrasa.bank.product

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProductTest {

    @Test
    fun creditCardProduct() {
        val creditCard = CreditCard(Branch.VISA)

        assertTrue(creditCard.isCreditProduct)
        assertEquals(CreditCard.ID, creditCard.id)
        assertEquals(Branch.VISA, creditCard.branch)
        assertEquals("${CreditCard.NAME} ${creditCard.branch.description}", creditCard.description())

        creditCard.tier = "GOLD"

        assertEquals("${CreditCard.NAME} ${creditCard.branch.description} GOLD", creditCard.description())
    }

    @Test
    fun debitCard() {
        val debitCard = DebitCard(Branch.MC)

    }

    @Test
    fun checkingAccount() {

    }


}