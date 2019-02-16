package lec04app

import com.google.gson.Gson
import java.io.File

class BillingImpl : Billing {

    private val file = File("operations")
    private val gson = Gson()

    override fun getShopIdOperations(shopId: String) {
        println("Running getShopIdOperations")
    }

    override fun getUserBalance(user: String) {
        println("Running getUserBalance")
    }

    override fun addOperation(operation: Operation) {

        file.appendText("${operation::class.java.name}||${gson.toJson(operation)}\n")

    }
}