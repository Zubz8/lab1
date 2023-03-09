import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    println("Program for finding the total of positive multiples c")
    println("put c: ")
    val c = scan.nextInt()

    when {
        c <= 0 -> println("the number is supposed to be positive")
        else -> {
            println("and those who belong on the line a, b. put a & b for a < b")
            val a = scan.nextInt()
            val b = scan.nextInt()
            when {
                a >= b || a <= 0 -> println("the number is supposed to be positive & a > b")
                else -> {
                    val total = totalOfPositiveMult(c, a, b)
                    println("total of these numbers = $total")
                }
            }
        }
    }
}

fun totalOfPositiveMult(c: Int, a: Int, b: Int): Int {
    var total = 0
    for (n in a..b) {
        if (n % c == 0) {
            total += n
        }
    }
    return total
}