package lec01oopbasics

interface Refundable {
    fun refund(sum: Float)

    // interface in Kotlin can has not abstract methods
//    fun checkRefundStatus(id: String): String {
//        return "success"
//    }

    //same as

    fun cheRefundStatus(id: String) = "success"
}