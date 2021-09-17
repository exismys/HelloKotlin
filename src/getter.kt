class Cat(val name: String, val breed: String, val weight: Int) {
    val weightInKg: Double
    get() = weight / 2.2;
}

fun main() {
    val someCat = Cat("SomeName", "SomeBreed", 10);
    println(someCat.weightInKg); 
}