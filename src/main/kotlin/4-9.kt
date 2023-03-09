import java.util.*

fun gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

fun nok(a: Int, b: Int): Int =
    a * b / gcd(a, b)

fun main() {
    val scan = Scanner(System.`in`)
    print("put the first natural number: ")
    val k = scan.nextInt()
    print("put the second natural number ")
    val l = scan.nextInt()

    if (k > 0 && l > 0) {
        val answer = nok(k, l)
        println("nok ($k, $l) = $answer")
    } else {
        println("the numbers k & l are not natural")
    }
}