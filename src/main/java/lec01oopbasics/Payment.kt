package lec01oopbasics

import java.util.Random
// import kotlin.random.Random

// Primary constructor
abstract class Payment(val sum: Float, val user: String, val shopId: String = "338") {
    var id = "" // mutable variable

//  initializer block
    init {
        id = Random().nextInt(sum.toInt() + 10).toString()
    }

    fun preparePayment() {
        println("Подготовка к выполнению платежа")
    }

    protected abstract fun doPayment()

    companion object {
        fun getAvailableShops() = listOf("65192", "338")
    }

    private fun saveToDB() {
        println("Сохраняем данные в БД")
    }

    fun addTenToId() = id + 10

    fun makePayment(payment: Payment) {
        payment.preparePayment()
        doPayment()
        saveToDB()
    }

    fun makeRefund(refundable: Refundable) {
        refundable.refund(234.22f)
    }
}
