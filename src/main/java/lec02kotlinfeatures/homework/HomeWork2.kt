package lec02kotlinfeatures.homework

import org.junit.Assert
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.math.abs
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

    fun regexFinder(list: List<String>, mask: String = "^[A-Z][a-z]{4}\$"): Int {
        return list.filter{ it.matches(Regex(mask)) }.count()
    }

    // Wrong behaviour for Int.MIN_VALUE: abs(Int.MIN_VALUE) = Int.MIN_VALUE -2147483648
    fun Int.numOfDigits1(): Int = abs(this).toString().length

    fun Int.numOfDigits2(): Int {

        var x = this

        // To avoid wrong behaviour for zero do the following:
        // There is always at least one digit in any integer number
        x /= 10
        var c = 1;
        while (x != 0) {
            x /= 10
            c++
        }
        return c
    }


    @Test
    fun numOfDigitsTest() {

        val ints: List<Int> = listOf(123456, -123456, 123, 1, 0, -1, Int.MAX_VALUE, Int.MIN_VALUE)
        println("ints = $ints")

        val expecteds = listOf(6, 6, 3, 1, 1, 1, 10, 10)
        println("expecteds = $expecteds")


        val actuals = mutableListOf<Int>()

        for (i in ints) {
//            actuals.add(x.numOfDigits1())
            actuals.add(i.numOfDigits2())
        }


        println("Int.MIN_VALUE = " + Int.MIN_VALUE)
        println("abs(Int.MIN_VALUE) = " + abs(Int.MIN_VALUE))
        println("actuals = $actuals")

        Assert.assertArrayEquals(expecteds.toIntArray(), actuals.toIntArray())

    }

}