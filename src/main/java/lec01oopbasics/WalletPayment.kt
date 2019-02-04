package lec01oopbasics

class WalletPayment(sum: Float, user: String, shopId: String) : Payment(sum, user, shopId), Refundable {
    override fun refund(sum: Float) {
        println("Делаем возврат на кошелек: $sum")
    }

    override fun doPayment() {
        println("Делаем платеж с кошелька")
    }
}
