package lms_127

fun task10_1(assessments: String): Int {

    val result = assessments.length
    return result    }
}

fun task10_2(assessments: String): Char {

    val answer = task10_2("LMFHMF")
    println(answer)
}

fun task10_3(assessments: String): Char {

    return assessments[assessments.length/2]
}

fun task10_4(assessments: String): String {

    val result = assessments.substring(0,3)
    return result
}
