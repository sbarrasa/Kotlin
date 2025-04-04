package com.sbarrasa.bank.product.registry

import com.sbarrasa.bank.product.types.CheckingAccount
import com.sbarrasa.bank.product.types.CreditCard
import com.sbarrasa.bank.product.types.DebitCard
import com.sbarrasa.bank.product.types.SavingAccount
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ProductRegistryTest{
    @Test
    fun create(){
        ProductRegistry
            .register(SavingAccount)
            .register(CheckingAccount)
            .register(CreditCard)
            .register(DebitCard)

        val product1:SavingAccount? = ProductRegistry.create("CC")
        val product2:CheckingAccount? = ProductRegistry.create("CA")
        val product3:CreditCard? = ProductRegistry.create("TC")
        val product4:DebitCard? = ProductRegistry.create("TD")

        assertTrue( product1 is SavingAccount)
        assertTrue( product2 is CheckingAccount)
        assertTrue( product3 is CreditCard)
        assertTrue( product4 is DebitCard)

    }
}