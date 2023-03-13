package lms_130

fun task7(items: List<Int>): Int {
    val items = listOf(10, 5, 11)
    var result = if (items.isNotEmpty()) items[0] else 0

    for (i in items) {
        if (i < result) {
            result = i
        }
    }

    return result
}
        fun main() {
            val items = listOf(10, 5, 11)

        println(task7 (items))
    }

