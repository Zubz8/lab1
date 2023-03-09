import java.util.*
import kotlin.math.*

fun main() {
    val scan = Scanner(System.`in`)
    print("put b here: ")
    val b = scan.nextInt()

    if (b < 0) {
        var a = b
        var i = 2
        while (a < 0) {
            a = ((a + abs(sin(i.toDouble()))) / (i - sin(i.toDouble()).pow(2))).toInt()
            i++
            println("a($i) = $a")
        }
        println("a = $a")
    } else {
        println("b has to be lower than zero")
    }
}