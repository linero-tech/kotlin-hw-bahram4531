package lms_129

fun task1(a: Int, b: Int): Int {

    var result = 0

    if (a >= b)
    {
        return result
    }
    else
    {
        for (i in a..b)
        {
            result += i
        }
    }
    return result
}
fun main() {
    val result = task1(1,5)
    println(result)
}