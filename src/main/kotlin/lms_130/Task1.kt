package lms_130

fun task1(items: List<Int>): Int {

    return if (items.isEmpty())
    {
     0
    } else
            {
items.random()
    }

}

fun main(){
    val result = task1(listOf())
        println(result)

}