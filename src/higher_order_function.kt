fun convert(x: Double, converter: (Double) -> Double): Double {
    return converter(x);
}

fun getConversionLambda(s: String): (Double) -> Double {
    if (s == "ctof") {
        return {it * 1.8 + 32};
    } else if (s == "ktop") {
        return {it * 2.205};
    } else {
        return {it};
    }
}

fun main() {
    println(convert(25.0, {x -> x * 1.8 + 32}));
    println(convert(20.0) {x -> x * 1.8 + 32});
    println(convert(25.0) {it * 1.8 + 32});

    val ctof = getConversionLambda("ctof");
    println(ctof(25.0));
}