package lec02kotlinfeatures.homework

import org.junit.Assert
import org.junit.Test
import java.lang.IllegalArgumentException

class HomeWork2Test {

    @Test
    fun mySqrt1Test1() {
        val hw2 = HomeWork2()
        val x = 16.0

        val expected = 4.0
        val actual = hw2.mySqrt(x)

        println(expected)
        println(actual)

        Assert.assertEquals(expected, actual, 0.0)
    }

    @Test
    fun mySqrt1Test2() {
        val hw2 = HomeWork2()

        val x = -16.0

        val expected = 4.0

        try {
            val actual = hw2.mySqrt(x)
            Assert.assertEquals(expected, actual, 0.0)
            println("FAIL: IllegalArgumentException was not caught but should")
        } catch (e: IllegalArgumentException) {
            println("PASSED: IllegalArgumentException was caught")
            return
        }
    }

    @Test
    fun myCheckTest() {
        val list1 = listOf<String>( "rgergqdqwwdADWFWEFSDFS13",
                                    "LDS;lsd;33333ojjiuigfughuhewuih8434",
                                    "lkkuhkhiuhi3uhk333sefewf",
                                    "3333",
                                    "lslmokrldk33333aad",
                                    "asd33333das")

        val list2 = listOf<String>( "rgergqdqwwdADWFWEFSDFS13",
                                    "lkkuhkhiuhi3uhk333sefewf",
                                    "3333",
                                    "lslmolfdk33333aad",
                                    "asd33333das")


        val actual1: Boolean = HomeWork2().myCheck(list1)
        val expected1 = true

        val actual2: Boolean = HomeWork2().myCheck(list2)
        val expected2 = false

        Assert.assertEquals(expected1, actual1)
        Assert.assertEquals(expected2, actual2)

    }

}