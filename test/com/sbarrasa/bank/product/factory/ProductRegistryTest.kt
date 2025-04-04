package com.sbarrasa.bank.product.factory

import com.sbarrasa.bank.product.types.CheckingAccount
import com.sbarrasa.bank.product.types.CreditCard
import com.sbarrasa.bank.product.types.DebitCard
import com.sbarrasa.bank.product.types.SavingAccount
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ProductRegistryTest{
    @BeforeEach
    fun init(){
        ProductRegistry
            .register(SavingAccount)
            .register(CheckingAccount)
            .register(CreditCard)
            .register(DebitCard)

    }

    @Test
    fun createSavingAccount() {
        val product: SavingAccount? = ProductRegistry.create("CC")
        assertNotNull(product)
        assertTrue(product is SavingAccount)
    }

    @Test
    fun createCheckingAccount() {
        val product: CheckingAccount? = ProductRegistry.create("CA")
        assertNotNull(product)
        assertTrue(product is CheckingAccount)
    }

    @Test
    fun createCreditCard() {
        val product: CreditCard? = ProductRegistry.create("TC")
        assertNotNull(product)
        assertTrue(product is CreditCard)
    }

    @Test
    fun createDebitCard() {
        val product: DebitCard? = ProductRegistry.create("TD")
        assertNotNull(product)
        assertTrue(product is DebitCard)
    }
}