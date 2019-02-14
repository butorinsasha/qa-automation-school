package lec04app

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

const val USAGE_MESSAGE = """
java - jar app.jar [COMMAND] [ARGUMENTS]
            Commands:
            payment %USER% %SUM% %SHOp_ID%
            deposit %USER% %SUM%
            balance %USER%
            shop_info %SHOP_ID%
"""

fun main(args: Array<String>) {
    try {

        // 'when' in Kotlin is like 'if-else' and 'switch-case' in Java
        when(args.command()) {
            "PAYMENT" -> println("Running payment")
            "DEPOSIT" -> println("Running deposit")
            "BALANCE" -> println("Running balance")
            "SHOP_INFO" -> println("Running shop_info")
            else -> throw IllegalArgumentException("Unknown command")

        }
    } catch (e: Throwable) {
        e.printStackTrace()
        println(USAGE_MESSAGE)
    }

    // Extension function fo Array<Sting>
}

private fun Array<String>.command(): String = this[0].toUpperCase()