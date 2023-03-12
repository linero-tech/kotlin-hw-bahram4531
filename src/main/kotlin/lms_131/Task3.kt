package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {


    val result = mutableListOf<Int>()
    for (key in a.keys) {
        if (b.containsKey(key)) {
            result.add(key)
        }
    }

    return result


}
fun main(){
    val a = mapOf(1 to "A", 2 to "B", 3 to "C")
    val b = mapOf(1 to "A", 2 to "B", 4 to "D")
    println(task3(a,b))
}