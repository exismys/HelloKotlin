data class Recipe(val title: String, val isVegetarian: Boolean) {}

fun main(array: Array<String>) {
    val recipe1 = Recipe("Chicken", false)
    val recipe2 = Recipe("Chicken", false)
    println(recipe1 == recipe2) // true, if the class was not prefixed with data keyword it would have resulted false
}