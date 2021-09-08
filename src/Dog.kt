class Dog (val name: String, val weight: Int, val breed: String) {
    fun bark() {
        if (weight > 20) {
            println("woof");
        } else {
            println("yeep");
        }
    }
}

fun main() {
    val newDog = Dog("Tommy", 25, "German Shepherd");
    newDog.bark();
}