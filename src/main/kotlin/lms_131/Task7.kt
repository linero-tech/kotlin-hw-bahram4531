package lms_131

fun task7(words: List<String>): Map<Int, String> {

    val result = mutableMapOf<Int, String>()
    for (i in words.indices) {
        result[i] = words[i]
    }
    return result
}
fun main()
{
    val words = listOf("I", "love", "Kotlin")
println(task7(words))
}
