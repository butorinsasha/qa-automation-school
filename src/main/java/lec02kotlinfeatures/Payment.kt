package lec02kotlinfeatures

import java.math.BigDecimal
import kotlin.random.Random

class Payment(var paymentType: String) {

    val id: String = paymentType.plus(Random.nextInt(1,3))

    var sum: BigDecimal = BigDecimal(0.0)
        get() = field.abs()
        set(value) {
            field = value.setScale(2, BigDecimal.ROUND_HALF_UP)
        }
}