package lms_130
fun task8(list: List<Int>): List<Int>
{
    val top4 = HashSet<Int>()

    for (item in list) {
        top4.add(item)
        while (top4.size > 4) {
            top4.remove(top4.minOrNull())
        }
    }

    return top4.toList().sorted()
}
fun main() {
    println(task8(listOf(1, 2, 2)))
}
