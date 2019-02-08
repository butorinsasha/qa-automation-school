package lec02kotlinfeatures

import java.util.*

data class KotlinSmsDataClass(
        var phone: String = "",
        var from: String = "",
        var id: Long? = System.currentTimeMillis(),
        var datetime: Long = Date().time,
        var content: String? = null
)