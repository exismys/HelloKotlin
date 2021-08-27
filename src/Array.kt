fun addNumbers(args: Array<Int>): Int {
    var i: Int = 0; var sum: Int = 0;
    while (i < args.size) {
        sum += args[i];
        i += 1;
    }
    return sum;
}

fun main() {
    var myArray = arrayOf(1, 2, 3, 4, 5);
    println(addNumbers(myArray));
    var myArray2: Array<Int> = arrayOf(1, 2, 3);
    println(addNumbers(myArray2));
}