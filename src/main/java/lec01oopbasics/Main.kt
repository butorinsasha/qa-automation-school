package lec01oopbasics

fun main(args : Array<String>) {

    // Cannot create an instance of abstract class
//    val payment = Payment(18.30f, "Vasya", "67192")
//    println("payment.id = " + payment.id)
//    println("payment.sum = " + payment.sum)
//    println("payment.user = " + payment.user)
//    println("payment.shoId = " + payment.shopId)
//
//    payment.doPayment()

    println()

//    val payment1 = Payment(18.30f, "Kolya")
//    println("payment1.id = " + payment1.id)
//    println("payment1.sum = " + payment1.sum)
//    println("payment1.user = " + payment1.user)
//    println("payment1.shoId = " + payment1.shopId)

    Payment.getAvailableShops()
//    payment.getAvailableShops() // Unresolved reference: getAvailableShops
//    payment.doPayment()

    println()

    val anyCardPayment = AnyCardPayment(123.45f, "Ilona") // Default value for shopId is not send when extending classes
    val anyCardPayment1 = AnyCardPayment(205.01f, "Kostya", "666")
    anyCardPayment.preparePayment()
//    anyCardPayment.doPayment()
    anyCardPayment.cardAuthorize()

    val walletPayment = WalletPayment(123.34f, "Ira", "87665")

    println()

    val anyCard: Payment = AnyCardPayment(666.66f, "Borya", "666")
    anyCard.makePayment(anyCard)
    anyCard.makeRefund(anyCardPayment);

    println()

    val wallet: Payment = WalletPayment(777.77f, "Klava", "777")
    wallet.makePayment(wallet)
    anyCard.makeRefund(walletPayment)

    println()

//    anyCard.saveToDB() //Cannot access 'saveToDB': it is private in 'Payment'
}