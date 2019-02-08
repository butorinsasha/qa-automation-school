package lec02kotlinfeatures

import org.junit.Assert
import org.junit.Test

class KotlinExceptionsTest {


    // IndexOutOfBoundsException
    @Test
    fun exceptionTest() {
        try {
            val list = mutableListOf(11, 12, 13, 14, 15)
            list.get(2)
            Assert.fail("${statusById[1]}: IndexOutOfBoundsException was not caught")
        } catch (e: IndexOutOfBoundsException) {
            println("${statusById[0]}: IndexOutOfBoundsException was caught")
            return
        }
    }




    // throw an IllegalArgumentException
    val statusById = hashMapOf(0 to "PASSED", 1 to "FAILED", 2 to "BROKEN", 3 to "SKIPPED", 4 to "BLOCKED")

    fun parseStatus(id: Int) =
            statusById[id] ?: throw IllegalArgumentException("Unkown status id $id")
    @Test
    fun parseStatusTest() {
        try {
            println(parseStatus(6))
            Assert.fail("FAILED: IllegalArgumentExeception was not caught")
        } catch (e: IllegalArgumentException) {
            println("PASSED: IllegalArgumentException was caught")
            return
        } finally {
            println("TEST ENDED")
        }
    }


    // Create own Exception
    @Test
    fun myExceptionTest() {
        val listCard = mutableListOf("5469550035327789, 5469552997924587")
        try {
            listCard.get(2)
        } catch (e: IndexOutOfBoundsException) {
            throw CardNotFoundException("карты нет")
        }
    }


}