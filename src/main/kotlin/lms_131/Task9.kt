package lms_131

import lms_130.result

fun task9(grades: Map<String, List<Double>>): Double {
    var totalGrades = 0.0
    var count = 0

    for (studentGrades in grades.values) {
        for (grade in studentGrades) {
            totalGrades += grade
            count++
        }
    }

    val average = totalGrades / count

    val result = String.format("%.2f", average).toDouble() // round to 2 decimal places

    return result
}
fun main(){
    val grades = mapOf(
        "Ana" to listOf(4.0, 4.5, 5.0),
        "John" to listOf(5.0, 5.0, 3.0),
        "Lise" to listOf(5.0, 5.0, 5.0))
println(task9(grades,))
    println("Average grade: $result")

}
