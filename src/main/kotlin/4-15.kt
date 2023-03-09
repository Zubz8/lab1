import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter a natural number:")
    val a = scanner.nextInt()

    var digit5 = false
    var number = a

    while (number > 0) {
        val digit = number % 10
        if (digit == 5) {
            digit5 = true
            break
        }
        number /= 10
    }

    if (digit5) {
        println("the number $a has a number 5")
    } else {
        println("the number $a doesn't have a 5")
    }
}