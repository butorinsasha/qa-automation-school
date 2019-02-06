package lec02kotlinfeatures

import org.junit.Test

class KotlinColectionsTest {

    @Test
    fun mutableTest() {
        val list = mutableListOf(1, 2, 3)
        list.add(4)
        list.remove(0)
        list.set(1, 10)

        println(list)
    }
}