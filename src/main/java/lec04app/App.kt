package lec04app

import java.lang.IllegalArgumentException
import java.math.BigDecimal

const val USAGE_MESSAGE = """
java - jar app.jar [COMMAND] [ARGUMENTS]
            Commands:
            payment %USER% %SUM% %SHOP_ID%
            deposit %USER% %SUM%
            balance %USER%
            shop_info %SHOP_ID%
"""

val billing: Billing = BillingImpl()

fun main(args: Array<String>) {
    try {

        // 'when' in Kotlin is like 'if-else' and 'switch-case' in Java
        when(args.command()) {
            "PAYMENT" -> billing.addOperation(Payment(args[1], BigDecimal(args[2]), args[3]))
            "DEPOSIT" -> billing.addOperation(Deposit(args[1], args[2].toBigDecimal()))
            "BALANCE" -> billing.getUserBalance(args[1])
            "SHOP_INFO" -> billing.getShopIdOperations(args[1])
            else -> throw IllegalArgumentException("Unknown command")

        }
    } catch (e: Throwable) {
        e.printStackTrace()
        println(USAGE_MESSAGE)
    }
}

// Extension function fo Array<Sting>
// C:\Users\butorinab\Documents\yamoney\work\qa\qa-automation-school\src\test\java\lec04app\AppTest.kt
private fun Array<String>.command(): String = this[0].toUpperCase()