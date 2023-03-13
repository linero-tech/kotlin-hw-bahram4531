package lms_130

fun task5(items: List<Int>): List<Int> {


    val items = listOf(1, 5, 11)
    val result = items.mapIndexed { index, element -> index * element }

    return result
}
 fun main() {
     val items = listOf(1, 5, 11)

     println(task5(listOf()))

 }