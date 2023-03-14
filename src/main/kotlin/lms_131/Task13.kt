package lms_131

import javax.print.DocFlavor.STRING

fun task13(sentence: String): String {
    val words = sentence.toLowerCase().split("[ ,.;:]".toRegex()).filter { it.isNotBlank() }
    val frequencyMap = mutableMapOf<String, Int>()
    for (word in words) {
        frequencyMap[word] = frequencyMap.getOrDefault(word, 0) + 1}
    var result = ""
    var maxFrequency = 0
    for ((word, frequency) in frequencyMap) {
        if (frequency > maxFrequency) {
            result = word
            maxFrequency = frequency
        }
    }

    return result
}

fun main() {
    val sentence = "This THIS is still the very very same"
    println(task13(sentence))
}