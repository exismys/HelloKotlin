fun main() {
    var array: Array<String> = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday");
    for ((index, value) in array.withIndex()) {
        println("index: $index value: $value");
    }
}