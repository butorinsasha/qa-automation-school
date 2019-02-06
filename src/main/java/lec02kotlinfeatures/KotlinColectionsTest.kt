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




    fun printList(list: MutableList<String>) {
        for (item in list) print(item)
    }

    @Test
    fun mapTest() {
        val list = mutableListOf("бояться", "горя", "счастья", "не", "знать")
//        List<String> listJava = new ArrayList<String>();
        val newList = list.map { it.plus(" + ") }

        println(newList)
        printList(newList as MutableList<String>)
    }


    @Test
    fun filterTest() {
        val list = mutableListOf("бояться", "горя", "счастья", "не", "знать")

        val newList = list.filter { it.contains('о') }
        println(newList)
    }


}