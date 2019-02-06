package lec02kotlinfeatures

import org.junit.Test

class KotlinColectionsTest {

    @Test
    fun mutableTest() {
        val mutableList = mutableListOf(1, 2, 3)
        mutableList.add(4)
        mutableList.remove(0)
        mutableList.set(1, 10)

        println(mutableList)
    }

    @Test
    fun immutableTest() {
        val immmutableList = listOf(1, 2, 3)
//        immmutableList.add(4) // Unresolved reference
//        immmutableList.remove(0) // Unresolved reference
//        immmutableList.set(1, 10) // Unresolved reference

        println(immmutableList)
    }


}