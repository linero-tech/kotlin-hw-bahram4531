package lms_131

fun task10(mapa: Map<Int, String>): Map<String, Int> {
    val result = mutableMapOf<String, Int>()
    for ((key, value) in mapa) {
        result[value] = key
    }
return result
}
fun main(){

    val mapa = mapOf(1 to "A", 2 to "B", 3 to "C")
println(task10(mapa))
}