package lms_127

fun task8(sentence: String, character: Char): Int
{
    val resultat = sentence . count{ it == character}

    return resultat
}
fun main()
{
    val result = task8("I code in KOTLIN",'I')
    println(result) }