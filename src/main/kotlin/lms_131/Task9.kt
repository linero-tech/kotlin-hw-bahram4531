package lms_131

import lms_130.result

fun task9(grades: Map<String, List<Double>>): Double {
    var sum = 0.0
    var count = 0

    for ((_, studentGrades) in grades) {
        for (grade in studentGrades) {
            sum += grade
            count++
        }
    }

    val result = if (count > 0) sum / count else 0.0

    return result
}

    fun main() {
        val grades = mapOf(
            "Ana" to listOf(4.0, 4.5, 5.0),
            "John" to listOf(5.0, 5.0, 3.0),
            "Lise" to listOf(5.0, 5.0, 5.0)
        )
        println(task9(grades,))

    }