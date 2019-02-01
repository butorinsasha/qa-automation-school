package lec01oopbasics

fun main(args : Array<String>) {
    val payment = Payment()
    println("payment.id = " + payment.id)
    println("payment.sum = " + payment.sum)
    println("payment.user = " + payment.user)
    println("payment.shoId = " + payment.shopId)

    payment.doPayment()
}