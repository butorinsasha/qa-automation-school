package lec02kotlinfeatures

import org.junit.Test
import java.util.*

class KotlinSmsDataClassTest {

    @Test
    fun smsTest() {
        val smsList = mutableListOf(

                KotlinSmsDataClass("79516849864",
                    "Saint-Petersburg"
                ),

                KotlinSmsDataClass("79512997924",
                    "Moscow"
                ))

        smsList.add(KotlinSmsDataClass("79516849864",
                        "Saint-Petersburg"
        ))

        val smsFilter = smsList.filter { sms ->
            sms.datetime > Date().time - 100
            sms.phone.equals("79516849864")
        }

        println(smsFilter)
    }

}