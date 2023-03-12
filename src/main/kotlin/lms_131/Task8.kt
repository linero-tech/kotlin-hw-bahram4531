package lms_131

fun task8(grades: Map<String, List<Double>>): String {
    var highestAverage = -1.0
    var result = ""
    for ((student, gradesList) in grades) {
        var sum = 0.0
        for (grade in gradesList) {
            sum += grade
        }
        val average = sum / gradesList.size
        if (average > highestAverage) {
            highestAverage = average
            result = student
        }
    }
    return result
    }
 fun main() {
     val grades = mapOf("Ana" to listOf(4.0, 4.5, 5.0), "John" to listOf(5.0, 5.0, 3.0), "Lise" to listOf(5.0, 5.0, 5.0))
     println(task8(grades))
 }