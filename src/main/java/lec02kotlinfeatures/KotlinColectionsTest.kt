package lec02kotlinfeatures

import org.junit.Assert
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

    fun printList1(list: MutableList<String>) {
        for (item in list) print(item)
    }

    fun printList2 (list: MutableList<String>) {
        for (i in 0..list.count()-1) print(list[i])
    }

    fun printList3 (list: MutableList<String>) {
        for (i in 0 until list.count()) print(list[i])
    }

    @Test
    fun mapTest() {
        val list = mutableListOf("бояться", "горя", "счастья", "не", "знать")
//        List<String> listJava = new ArrayList<String>();
        val newList = list.map { it.plus(" + ") }

        println(newList)
        printList1(newList as MutableList<String>)
        println()
        printList2(newList)
    }

    @Test
    fun filterTest() {
        val list = mutableListOf("бояться", "горя", "счастья", "не", "знать")

        val newList = list.filter { it.contains('о') } // русская 'о'
        println(newList)
    }

    @Test
    fun anyTest() {
        val list = mutableListOf("бояться", "горя", "счастья", "не", "знать")

        // why val ?
        // val list = mutableListOf("раз", "два", "три")

        val newList = list.any { it.contains('о') }

        println(newList)
    }

    @Test
    fun countTest() {
        val list = mutableListOf("бояться", "горя", "счастья", "не", "знать")

        val newList = list.filter { it.contains('о') }.count()

        println(newList)
    }

    /**
     * На вход метода типа Boolean подается 4 агрумента типа Boolean.Метод возвращает true в том и только том случае, когда два аргумента true
     */

     fun twoTruths(first: Boolean,
                   second: Boolean,
                   third: Boolean,
                   fourth: Boolean): Boolean {
        return listOf(first, second, third, fourth).filter { it }.count() == 2
    }

    @Test
    fun twoTruthsTest() {
        Assert.assertTrue(twoTruths(true, true, false, false))
        Assert.assertTrue(twoTruths(true, false, true, false))
        Assert.assertFalse(twoTruths(true, false, true, true ))
        Assert.assertFalse(twoTruths(true, false, true, true ))
        Assert.assertFalse(twoTruths(true, true, true, true))
        Assert.assertFalse(twoTruths(false, false, false, false))
    }
}