package lms_131

fun task15(sentence: String): Map<Char, Int> {

    val result = mutableMapOf<Char, Int>()

    for (word in sentence.split(" ")) {
        val firstLetter = word.firstOrNull { it.isLetter() }?.toLowerCase()
        if (firstLetter != null) {
            result[firstLetter] = result.getOrDefault(firstLetter, 0) + 1
        }
    }
        return result}

fun main (){
    val sentence = "This is the Very small Text"
println(task15(sentence))
}