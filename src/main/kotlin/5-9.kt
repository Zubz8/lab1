import java.util.Scanner
import kotlin.math.cos

fun main() {
    val scan = Scanner(System.`in`)
    println("put whole numbers a & b, for b >= 2  b <=5")
    val a = Integer.parseInt(scan.nextLine())
    val b = Integer.parseInt(scan.nextLine())
    if (b in 2..5) {
        val total = function(a, b)
        println("answer: $total")
    } else {
        println("Error incorrect numbers")
    }
}

fun function(a: Int, b: Int): Double {
    var c = 0.0
    when (b) {
        2 -> c = (1 + cos(2 * a.toDouble())) / 2
        3 -> c = (3 * cos(a.toDouble()) + cos(3 * a.toDouble())) / 4
        4 -> c = (3 + 4 * cos(2 * a.toDouble()) + cos(4 * a.toDouble())) / 8
        5 -> c = (10 * cos(a.toDouble()) + 5 * cos(3 * a.toDouble()) + cos(5 * a.toDouble())) / 16
    }
    return c
}