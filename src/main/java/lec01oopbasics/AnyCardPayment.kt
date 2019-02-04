package lec01oopbasics

class AnyCardPayment (sum: Float, user: String, shopId: String = "666") : Payment(sum, user, shopId) {

    val card = Card()

    override fun doPayment() {
        println("Проводим платеж картой")
    }

    fun cardAuthorize() {
        println("Авторицация карты:" + card.getCardNumber())
    }
}