import java.util.*
import kotlin.math.*

const val a = Math.E
fun main() {
    val scan = Scanner(System.`in`)
    print("start of the number = ")
    var b = scan.nextDouble()
    print("put the step = ")
    val c = scan.nextDouble()

    var z = 0.0


    if (b <= 0) {
        while (a.pow(0.2) < (5 * abs(b))) {
            z += countTheNumbers(b)
            b += c
        }
    } else {
        println("the number is supposed to be less than or equal to zero")
        return
    }

    println(z)
}
fun countTheNumbers(z: Double): Double {
    return (a.pow(0.2 * z) + sqrt(a.pow(0.2 * z)).pow(3) + sqrt(a.pow(0.2 * z)).pow(5))
}