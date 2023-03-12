package lms_131

fun task6(mapa: Map<Int, String>, parameter: String): Map<Int, String> {


    val result = mutableMapOf<Int, String>()
    for ((key, value) in mapa) {
        if (value == parameter) {
            result[key] = value
        }
    }
return result

}
fun main() {
    val mapa = mapOf(20 to "Ana", 40 to "John", 22 to "Ana")
    val parameter = "Ana"
    println(task6(mapa, parameter))
}