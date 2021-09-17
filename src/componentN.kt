data class Coordinates (val x: Int, val y: Int, val z: Int) {}

fun main(array: Array<String>) {
    val coordinate1 = Coordinates(1, 2, 3);
    val (x, y, z) = coordinate1
    println(x + y + z)

    // The above code is same as
    val a = coordinate1.component1();
    val b = coordinate1.component2();
    val c = coordinate1.component3();
    println("Coordinates: $a $b $c")
}