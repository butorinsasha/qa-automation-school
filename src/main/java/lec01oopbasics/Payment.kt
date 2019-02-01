package lec01oopbasics

class Payment {
    val id: String = "00001"
    val sum: Float = 123.45f
    val user: String = "Aleksandr"
    val shopId: String = "1337"

    fun preparePayment() {
        println("Подготовка пк выполнению плтежа")
    }

    fun doPayment() {
        println("Проводим платеж")
    }
}
