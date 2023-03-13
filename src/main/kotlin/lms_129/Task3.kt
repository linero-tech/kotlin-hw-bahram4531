package lms_129

fun task3(number: Int): Int {

    var number = 5 // example value
    var result = 1

    for (i in 1..number) {
        result *= i
    }

    return result
}
fun main() {

    var number = 5 // example value
    var result = 1
    println(task3(5))
    println(task3(1))
}