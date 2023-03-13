package lms_130

fun task11_1(guests: List<String>): Int {

    val guests = arrayOf("Lia-K", "Mar-A", "Luz-K", "Ulf-V")
    val result = guests.size
    println(result) // Output: 4

    return result
}

fun task11_2(guests: List<String>, condition: String): List<String> {

    return result
}
    val guests = arrayOf("Lia-K", "Mar-A", "Luz-K", "Ulf-V")
    val condition = "-K"
    val result = guests.filter { it.endsWith(condition) }



fun main() {

    // Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
    val conditionOfInterest = "-V"
    val listOfAttendees = listOf(
        "Stéphanie-A",
        "Edmée-K",
        "Maëlla-K",
        "Océanne-K",
        "Géraldine-K",
        "Maëline-K",
    )

    println("The event has a total of ${task11_1(listOfAttendees)} attendees.")
    println("The attendees with condition $conditionOfInterest are ${task11_2(listOfAttendees, conditionOfInterest)}")
}
