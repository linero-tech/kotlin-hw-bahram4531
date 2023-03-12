package lms_131

fun task5(mapa: Map<Int, Int>, constant: Int): List<Int> {

    val result = mutableListOf<Int>()
    for ((key, value) in mapa) {
        if (value != constant) {
            result.add(key)
        }
    }
return result
}
fun main() {
    val mapa = mapOf(1 to 100, 3 to 200, 4 to 500)
    val constant = 100
    println(task5(mapa, constant))
}
