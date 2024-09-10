val name: String = "Alice"

var age: Int = 30

const val PI = 3.14

lateinit var userInfo: String

val lazyValue: String by lazy {
    "Hello, this is a lazy string!"
}

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >=0) field = value
    }