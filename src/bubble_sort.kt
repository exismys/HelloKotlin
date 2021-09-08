fun bubbleSort(args: Array<Int>) {
    var countIteration = 0;
    for (i in 0..args.size - 2) {
        var flag = true;
        for (j in 0..args.size - 2) {
            if (args[j] > args[j + 1]) {
                val temp = args[j + 1];
                args[j + 1] = args[j];
                args[j] = temp;
                flag = false;
            }
        }
        countIteration++;
        if (flag) {
            println("done in $countIteration iterations")
            break;
        }
    }
}

fun main() {
    val myArray = arrayOf(10, 5, 50, 30, 20);
    bubbleSort(myArray);
    for (i in myArray) {
        print("$i ");
    }
}