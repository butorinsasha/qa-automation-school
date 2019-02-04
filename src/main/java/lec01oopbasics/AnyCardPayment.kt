package lec01oopbasics

class AnyCardPayment (sum: Float, user: String, shopId: String = "666") : Payment(sum, user, shopId) {

    override fun doPayment() {
        print("Проводим платеж картой")
    }

    fun cardAuthorize() {
        println("Авторицация карты")
    }
}