package lec04app

import com.google.gson.Gson
import java.io.File

class BillingImpl : Billing {

    private val file = File("operations")
    private val gson = Gson()

    override fun getShopIdOperations(shopId: String) {
        file.readLines()
                .map{ it.toOperation() }
                // is ~ instanceof
                .filter { it is Payment && it.shopId == shopId }
                .forEach{
                    println(it)
                }
    }

    override fun getUserBalance(user: String) {
        println("Running getUserBalance")
    }

    override fun addOperation(operation: Operation) {
        file.appendText("${operation::class.java.name}||${gson.toJson(operation)}\n")
    }

    private fun String.toOperation(): Operation {
        val type = this.substringBefore("||")
        val json = this.substringAfter("||")

        return gson.fromJson<Operation>(json, Class.forName(type))
//        same as following...?
//        return gson.fromJson(json, Class.forName(type)) as Operation
    }
}