package lec04app

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
        throw IllegalStateException()
    } catch (e: Throwable) {
        e.printStackTrace()
        println(USAGE_MESSAGE)
    }

}