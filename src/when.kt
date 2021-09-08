fun main(array: Array<String>) {
    val x = 1
    when (x) {
        0 -> println("x is 0")
        1 -> println("x is 1")
        else -> {
            println("x is neither 0 nor 1")
        }
    }

    // Using when as an expression
    val result = when (x) {
        0 -> false
        else -> true
    }
    println(result)
}