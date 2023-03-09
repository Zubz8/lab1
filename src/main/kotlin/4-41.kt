//import java.util.Scanner
//import kotlin.math.pow
//
//fun main() {
//    val scan = Scanner(System.`in`)
//    print("put it as a natural n: ")
//    val n = scan.nextInt()
//    val total = countTheTotal(n)
//    println("total = $total")
//}
//
//fun countTheTotal(n:Int):Double{
//    var total = 0.0
//    var frac = 1.0
//    for (i in 1..n) {
//        frac *= i
//        total += (-1.0).pow(i) * (i + 1) / frac
//    }
//    return total
//}

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("put it as a natural n: ")
    val n = scan.nextInt()

    val total = countTheTotal(n)
    println("total = $total")
}

fun countTheTotal(n: Int): Double {
    var totali = 0.0
    for (i in 1..n) {
        var totalj = 0.0
        for (j in 1..i) {
            totalj += 1.0/j
        }
        val fract = (1..i).fold(1.0) { acc, num -> acc * num }
        totali += fract / totalj
    }
    return totali
}
