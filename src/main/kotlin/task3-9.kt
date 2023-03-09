import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()

    if (a in 10..99) {
        val total = weTotal(a)
        println("\nis a double digit number, sum of digits: $total")
    } else if (a in 100..999) {
        val sum = sumOfAll(a)
        println("\nthe number is a 3 digit one, product of non-zero digits of a number: $sum")
    }
}
fun sumOfAll (number: Int): Int {
    var sum = 1
    var a = number
    while (a > 0) {
        val digit = a % 10
        if (digit != 0) {
            sum *= digit
        }
        a /= 10
    }
    return sum
}
fun weTotal(number: Int): Int {
    var total = 0
    var a = number
    while (a > 0) {
        total += a % 10
        a /= 10
    }
    return total
}