class SomeClass(val aStringVariable: String) {
    var stringVar = aStringVariable
    set(value) {
        println("Setting stringVar to a new value " + value);
        field = value;
    }
}

fun main() {
    val someVar = SomeClass("Hello World");
    someVar.stringVar = "Goodbye world";
    println(someVar.stringVar);
}