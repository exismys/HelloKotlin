fun main() {
    val addNumbers = {x: Int, y: Int -> x + y};
    println(addNumbers.invoke(10, 10));
    println(addNumbers(20, 20));

    val addOne: (Int) -> Int = {x -> x + 1}; // Don't need to specify parameter type of lambda as compiler can infer it from variable type definition
    println(addOne(4));

    // If the lambda has a single parameter and the compiler can infer its type then we can omit the parameter name from lambda expression and refer to it by 'it'
    val addTwo: (Int) -> Int = {it + 2};
    println(addTwo(8));
}