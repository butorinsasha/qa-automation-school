package lec01oopbasics

import java.util.Random
// import kotlin.random.Random

// Primary constructor
class Payment(val sum: Float, val user: String, val shopId: String = "338") {
    var id = "" // mutable variable

//  initializer block
    init {
        id = Random().nextInt(sum.toInt() + 10).toString()
    }

    fun preparePayment() {
        println("Подготовка пк выполнению плтежа")
    }

    fun doPayment() {
        println("Проводим платеж")
    }

    companion object {
        fun getAvailableShops() = listOf("65192", "338")
    }
}
