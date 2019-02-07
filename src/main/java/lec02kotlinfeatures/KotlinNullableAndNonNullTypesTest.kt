package lec02kotlinfeatures

import org.junit.Test

class KotlinNullableAndNonNullTypesTest {


    @Test
    fun nulableAndNonNullTest() {
        var sum: String? = "19.35"
        sum = null

        var id: String = "123"
//        id = null //Null can not be a value of a non-null type String
    }



    @Test
    fun npeTest() {
        val sum: String? = "19,35"
//        val lenSum : Int? = sum.length // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    }


    // if (sum != null)
    @Test
    fun npeTestIf() {
        val sum: String = "19.35"
        val lenSum : Int?

        if (sum != null) {
            lenSum = sum.length
        } else {
            lenSum = 0
        }
        println(lenSum)
    }




    @Test
    fun npeTestNull() {
        val sum: String? = null
        val lenSum : Int?

        lenSum = sum?.length

        println(lenSum)
    }




    @Test
    fun npeTestTernary() {
        val sum: String? = null
        val lenSum : Int?

        lenSum = sum?.length ?: 0 // lenSum will be initialized by null when sum is null

        println(lenSum)
    }



    @Test
    fun npeTest4() {
        val sum: String? = null
        val lenSum : Int?

        lenSum = sum!!.length // intentionally leeds to NPE

        println(lenSum)
    }

}
