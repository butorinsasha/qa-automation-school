package lec02kotlinfeatures.homework

internal object JavaComma {
    @JvmStatic
    fun main(args: Array<String>) {
        var i: Int
        var j: Int
        i = 0
        j = 10
        while (i < j) {
            println("x and j: $i $j")
            i++
            j--
        }
    }
}

