import java.util.*
// for positive numbers
fun main() {
    val scan = Scanner(System.`in`)
    print("put m: ")
    val a = scan.nextInt()

    if (a > 0) {
        val total = totalOfOddAndEvenNum(a)
        println("total of these numbers = $total")
    } else {
        println("a is supposed to be > 0")
    }
}

fun totalOfOddAndEvenNum(a: Int): Int {
    var total = 0
    for (b in 1 until a step 2) {
        total += b
    }
    return total
}