package lms_131

fun task11(mapa: Map<Int, String>, prospect: Int): Boolean {


    val result = mapa.containsKey(prospect)


    return result
}
fun main (){
    val mapa = mapOf(1 to "A", 2 to "B", 3 to "C")
    val prospect = 1


    println(task11(mapa, prospect ))
}