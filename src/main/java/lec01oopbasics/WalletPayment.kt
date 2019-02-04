package lec01oopbasics

class WalletPayment(sum: Float, user: String, shopId: String) : Payment(sum, user, shopId) {
    override fun doPayment() {
        println("Делаем платеж с кошелька")
    }
}