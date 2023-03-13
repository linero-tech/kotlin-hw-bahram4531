package lms_130
fun task8(list: List<Int>): List<Int>
{
    val top3 = HashSet<Int>()

    for (item in list) {
        top3.add(item)
        while (top3.size > 3) {
            top3.remove(top3.minOrNull())
        }
    }

    return top3.toList().sorted()
}
fun main() {
    println(task8(listOf(1, 2, 2)))
}
