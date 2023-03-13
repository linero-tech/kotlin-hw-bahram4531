package lms_130

import lms_131.task12

fun task12_1(sells: List<Int>): String {

    val sells = arrayOf(20, 100, 800, 768, 765, 90, 10)
    var maxIndex = 0
    for (i in 1 until sells.size) {
        if (sells[i] > sells[maxIndex]) {
            maxIndex = i
        }
    }
    val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val result = daysOfWeek[maxIndex]

    return result
}

fun task12_2(sells: List<Int>): String {
    val sells = arrayOf(20, 100, 800, 768, 765, 90, 10)
    var minIndex = 0
    for (i in 1 until sells.size) {
        if (sells[i] < sells[minIndex]) {
            minIndex = i
        }
    }
    val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val result = daysOfWeek[minIndex]

    return result
}

fun task12_3(sells: List<Int>): Int {
    val sells = arrayOf(20, 100, 800, 768, 765, 90, 10)
    var totalSells = 0
    for (i in 0 until sells.size) {
        totalSells += sells[i]
    }
    val result = totalSells

    return result
}

fun main () {
    fun main() {

        val result1 = task12_1(listOf(20, 100, 800, 768, 765, 90, 10))
        println(result1)

        val result2 = task12_2(listOf(20, 100, 800, 768, 765, 90, 10))
        println(result2)

        val result3 = task12_3(listOf(20, 100, 800, 768, 765, 90, 10))
        println(result3)

    }
}
