package lec02kotlinfeatures

import org.junit.Test

class ExtensionFunctionsTest {

    // Traditional solution

    @Test
    fun swapTest() {
        val list = mutableListOf(11, 12, 13, 14, 15)

        val tmp = list[1]
        list[1] = list[3]
        list[3] = tmp

        println(list)
    }

    fun swap1(list: MutableList<Int>, index1: Int, index2: Int) {
        val tmp = list[index1]
        list[index1] = list[index2]
        list[index2] = tmp
    }

    @Test
    fun swap1Test() {
        val list = mutableListOf(11, 12, 13, 14, 15)

        swap1(list, 1,3 )

        println(list)
    }

    // Here is extention function take place

    fun MutableList<Int>.swap2(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }

    @Test
    fun swap2Test() {
        val list = mutableListOf(11, 12, 13, 14, 15)

        list.swap2(1, 3)

        println(list)
    }
}