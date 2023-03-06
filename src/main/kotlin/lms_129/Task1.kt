package lms_129

fun task1(a: Int, b: Int): Int {
    val a = 1
    val b = 5
    var result = 0

    if (a >= b) {
        println("result is $result")
    } else {
        for (i in a..b) {
            result += i
        }
        println("result is $result")
        return result
    }


