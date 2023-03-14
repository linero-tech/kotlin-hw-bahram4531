package lms_131

fun task14(sentence: String): Char {

    val chars = sentence.toLowerCase().replace(" ", "")
    val frequencyMap = mutableMapOf<Char, Int>()
    for (char in chars) {
        frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
    }
    var result = ' '
    var maxFrequency = 0
    for ((char, frequency) in frequencyMap) {
        if (frequency > maxFrequency) {
            result = char
            maxFrequency = frequency
        }
    }


    return result
}

fun main() {
    val sentence = "I am it"
    println(task14(sentence))
}