package lms_131

fun task15(sentence: String): Map<Char, Int> {

    val words = sentence.toLowerCase().split("[ ,.;:]".toRegex()).filter { it.isNotBlank() }
    val result = mutableMapOf<Char, Int>()
    for (word in words) {
        val firstLetter = word.firstOrNull()
        if (firstLetter != null && firstLetter.isLetter()) {
            result[firstLetter] = result.getOrDefault(firstLetter, 0) + 1
        }
    }

    return result
}


fun main(){
    val sentence = "This is the Very small Text"
    println(task15(sentence))
}