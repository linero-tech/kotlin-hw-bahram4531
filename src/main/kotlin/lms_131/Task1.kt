package lms_131

fun task1(): Map<Int, Int> {
    val result = mutableMapOf<Int, Int>()
    for (i in 11..19 step 2) {
        result[i] = i * 2
    }

    return result

}

fun main() {
    println(task1())

}
