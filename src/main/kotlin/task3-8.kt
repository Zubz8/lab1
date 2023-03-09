//import java.util.Scanner
//fun main() {
//val scanner = Scanner(System.`in`)
//    val numeral = 712
//    if (checkNumber(numeral)) {
//        val lastTwoNumbers = numeral % 100
//        println(lastTwoNumbers)
//    } else {
//        println("is a 3 digit number")
//    }
//}
//fun main() {
//    val numeral = 713
//    if (checkNumber(numeral)) {
//        val lastTwoNumbers = numeral % 100
//        println(lastTwoNumbers)
//    } else if (numeral < 100) {
//        println("number is less than 100")
//    } else {
//        println("number is greater 999")
//    }
//}
//
//fun main() {
//    val numeral = 714
//    val result = if (checkNumber(numeral)) numeral % 100 else "the number isn't 3 digit"
//    println(result)
//}
//fun checkNumber(number: Int): Boolean {
//    return number in 100..999
//}