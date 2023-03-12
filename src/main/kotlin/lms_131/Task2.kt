package lms_131

fun task2(mapa: Map<Int, Int>): Int {

    var result = 0
    for ((key, value) in mapa) {
        result += key
    }

    return result


}
fun main() {
    val mapa = mapOf(1 to 10, 2 to 20, 3 to 30)
    println(task2(mapa))
}