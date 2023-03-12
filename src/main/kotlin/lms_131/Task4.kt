package lms_131

fun task4(mapa: Map<Int, Int>, value: Int): List<Int> {


    val result = mutableListOf<Int>()
    for ((key, v) in mapa) {
        if (v == value) {
            result.add(key)
        }
    }

    return result

}

fun main() {
   val mapa = mapOf(1 to 100, 2 to 100, 3 to 200)
    val value = 100
    println(task4(mapa, value))
}