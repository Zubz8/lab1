import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = countB(a)
    println("b = $b")
}

fun countB(a: Int): Int {
    return when {
        a <= 0 -> 0
        a in 1..1 -> a
        else -> a.toDouble().pow(2.0).toInt()
    }
}

//2
//
//import java.util.Scanner
//import kotlin.math.log10
//import kotlin.math.pow
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val a = scanner.nextInt()
//    val b = countB(a)
//    println("b = $b")
//}
//
//fun countB(a: Int): Int {
//    return when {
//        a > 0 -> log10(a.toDouble()).toInt()
//        a == 0 -> 0
//        else -> a.toDouble().pow(2.0).toInt()
//    }
//}