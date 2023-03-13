package lms_130

import kotlin.random.Random

fun task1(items: List<Int>): Int {


    val result = if (items.isNotEmpty()) {

        items[Random.nextInt(items.size)]  }

    else {
        0
    }
    return result
}
fun main() {

    val items = listOf(1, 2, 3, 4, 5)
println(task1(items))
}