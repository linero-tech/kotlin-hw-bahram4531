package lms_129

fun task5(sentence: String): Int {

    var sentence = "I love GBG" // example value
    var result = 0

    for (i in sentence.indices) {
        result++
    }


    return result
}

fun main(){
    println(task5(sentence = "I love GBG" ))

}