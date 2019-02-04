package lec01oopbasics

class AnyCardPayment (sum: Float, user: String, shopId: String = "666") : Refundable, Payment(sum, user, shopId) {
    override fun refund(sum: Float) {
        println("Делаем возврат на банковскую карту: $sum")
    }

    val card = Card()

    override fun doPayment() {
        println("Проводим платеж картой")
    }

    fun cardAuthorize() {
        println("Авторицация карты: " + card.getCardNumber())
    }
}