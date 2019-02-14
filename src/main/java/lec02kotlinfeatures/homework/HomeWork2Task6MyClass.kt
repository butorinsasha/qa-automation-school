package lec02kotlinfeatures.homework

class HomeWork2Task6MyClass(val isTrue: Boolean) {

    var x: Double = 0.0
        get() {
            if (field > 0) return field
            else throw NotPositiveNumberException("x = $field is not positive")
        }

    var s: String = ""
        get() = field.toLowerCase()
        set(value) {
            field = value.replace("<", "lt", false).replace(">", "gt", false)
        }

}