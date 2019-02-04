package lec01oopbasics

fun main(args : Array<String>) {
    val payment = Payment(18.30f, "Vasya", "67192")
    println("payment.id = " + payment.id)
    println("payment.sum = " + payment.sum)
    println("payment.user = " + payment.user)
    println("payment.shoId = " + payment.shopId)

    payment.doPayment()

    println()

    val payment1 = Payment(18.30f, "Kolya")
    println("payment1.id = " + payment1.id)
    println("payment1.sum = " + payment1.sum)
    println("payment1.user = " + payment1.user)
    println("payment1.shoId = " + payment1.shopId)

    Payment.getAvailableShops()
//    payment.getAvailableShops() // Unresolved reference: getAvailableShops
    payment.doPayment()

//    val payment2 = Payment()
//    println("payment2.id = " + payment2.id)
//    println("payment2.sum = " + payment2.sum)
//    println("payment2.user = " + payment2.user)
//    println("payment2.shoId = " + payment2.shopId)

}