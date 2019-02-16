package lec04app

import java.io.File

class BillingImpl : Billing {

    private val file = File("operations")

    override fun getShopIdOperations(shopId: String) {
        println("Running getShopIdOperations")
    }

    override fun getUserBalance(user: String) {
        println("Running getUserBalance")
    }

    override fun addOperation(operation: Operation) {
        println("Running addOperation")
    }
}