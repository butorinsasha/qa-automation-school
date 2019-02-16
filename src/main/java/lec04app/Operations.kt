package lec04app

import java.math.BigDecimal


interface Operation {
    val sum: BigDecimal
    val user: String
    fun newBalance(oldBalance: BigDecimal): BigDecimal
}

data class Deposit(
        override val user: String,
        override val sum: BigDecimal
) : Operation {
    override fun newBalance(oldBalance: BigDecimal): BigDecimal {
        // return oldBalance.plus(sum)
        // same as following...
        return oldBalance + sum
    }
}

data class Payment(
        override val user: String,
        override val sum: BigDecimal,
        val shopId: String
) : Operation {
    override fun newBalance(oldBalance: BigDecimal): BigDecimal {
        return oldBalance - sum
    }
}
