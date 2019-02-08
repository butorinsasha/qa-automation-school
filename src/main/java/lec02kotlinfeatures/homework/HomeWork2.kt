package lec02kotlinfeatures.homework

import java.lang.IllegalArgumentException
import kotlin.math.sqrt

fun mySqrtOutClass(x: Double) = Math.sqrt(x)

class HomeWork2 {

//    fun mySqrt(x: Double) = Math.sqrt(x)

    fun mySqrt(x: Double): Double {
        if (x >= 0) return Math.sqrt(x)
        else throw IllegalArgumentException("Expected non-negative number, got $x")
    }

    fun myCheck(list: List<String>, subString: String = "33333", subStringLength: Int = 18): Boolean {
        return list.any {   it.contains(subString)
                            && it.length == subStringLength }
    }

}