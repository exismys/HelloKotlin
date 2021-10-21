fun main() {
    var s: String? = "Hello World";
    if (s != null) {
        println(s.length);
    }

    // Alt
    s?.let {
        println(it); // 'it' is not nullable
    }

    // Elvis operator
    println(s?:"null")
    s = null;
    println(s?:"null")
}