package lms_130

fun task3(items: List<Int>): Int {

    val items = listOf(1, 2, 3, 4)

    val result = if (items.isNotEmpty()) {
        items.filterIndexed { index, _ -> index % 2 == 0 }
            .sum()
    } else {
        0
}
    return result
    }
fun main(){
    val items = listOf(1, 2, 3, 4)
    println(task3(items))
    }