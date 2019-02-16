package lec04app

import java.math.BigDecimal


interface Operation {
    val sum: BigDecimal
    val user: String
}

data class Deposit(
        override val user: String,
        override val sum: BigDecimal
) : Operation

data class Payment(
        override val user: String,
        override val sum: BigDecimal,
        val shopId: String
) : Operation
