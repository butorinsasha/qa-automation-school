package lec01oopbasics

class Payment {
    val id: String = ""
    val sum: Float = 0.0f
    val user: String = ""
    val shopId: String = ""

    fun preparePayment() {
        println("Подготовка пк выполнению плтежа")
    }

    fun doPayment() {
        println("Подготовка к выполнению платежа")
    }
}