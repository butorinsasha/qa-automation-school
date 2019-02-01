package lec01oopbasics

class Payment {
    val id: String = "00001"
    val sum: Float = 123.45f
    val user: String = "Sasha"
    val shopId: String = "1337"

    fun preparePayment() {
        println("Подготовка пк выполнению плтежа")
    }

    fun doPayment() {
        println("Проводим платеж")
    }
}
