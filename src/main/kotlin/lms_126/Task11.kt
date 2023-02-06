package lms_126

fun task11(): String {

    return """
      INPUT: temperature value with unit ("C or F")
      INPUT: the unit of the input temperature
      IF: the unit is C, convert it to Fahrenheit using the formula: value in C * 9 / 5 + 32
      IF: the unit is F, convert it to Celsius using the formula: value in F - 32 * 5 / 9
      OUTPUT: the result with the new unit ("F or C")
      OUTPUT: transaction
    """
}