package lec02kotlinfeatures

import org.junit.Test
import java.math.BigDecimal

class KotlinGettersSettersPaymentTest {

    @Test
    fun getTest() {
        val payment = Payment("AC")

        payment.sum = BigDecimal(-10.55698)
        println(payment.sum)
    }

}