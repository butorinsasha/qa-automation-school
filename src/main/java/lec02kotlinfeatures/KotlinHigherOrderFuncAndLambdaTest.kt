package lec02kotlinfeatures

import org.junit.Assert.*
import org.junit.Test

class KotlinHigherOrderFuncAndLambdaTest {

    // 1. Array generator
    val myArray1 = Array(5, { i -> i * 2 }) // Lambda argument should be moved out of parentheses
    val myArray2 = Array(5) { i -> i * 2 }

    @Test
    fun arrayTest() {
        println("println(myArray1)" + myArray1)
        println("println(myArray1): $myArray2")
    }




    // checkThat()
//    fun checkThat(description: String, whatCheck: () -> Boolean) {
//        step("Прроверяем, что $description") {
//            assertThat(description, whatCheck())
//        }
//    }

//    @Test
//    checkThatTest() {
//        checkThat(  "описание не пустое",
//                    { description.text.text.isNotEmpty() })
//    }
}