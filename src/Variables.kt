fun main() {
    var number: Int = 5;
    var number2: Double = 5.2;
    println("number 1: $number number 2: $number2"); // 5, 5.2

    // In Kotlin, numbers are objects, and variable holds a reference to the object, not the object itself
    var number3: Int = number2.toInt();
    println(number3); // 5
}