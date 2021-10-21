fun main() {
    for (i in 0..10) {
        println(i); // 0 and 10 are included
    }

    for (i in 0..10 step 2) {
        println(i);
    }

    for (i in 10 downTo 0) {
        println(i); // 10 and 0 are included
    }

    // Traversing with step
    for (i in 10 downTo 0 step 2) {
        println(i);
    }
}