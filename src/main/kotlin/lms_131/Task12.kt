package lms_131

import lms_130.result


fun task12(a: List<Int>, b: List<String>): Map<Int, String> {

    val result = mutableMapOf<Int, String>()

    for (i in a.indices) {
        result[a[i]] = b[i]
    }


    return result
}

fun main() {
    val a = listOf(1, 2, 3, 4)
    val b = listOf("W", "X", "Y", "Z")
    println(task12(a,b))
}