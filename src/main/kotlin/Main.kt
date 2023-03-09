import java.util.*
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val XD = Scanner(System.`in`)
        println("put any number in b")
        val b = XD.nextDouble()
        println("get shat on")
        var a1 = b
        var i = 2
        while (a1 < 0) {
            a1 -= a1 * i - 1 + abs(sin(i.toDouble())) / i - sin(i.toDouble()).pow(2.0)
            i++
        }
        println(a1)
    }
}
