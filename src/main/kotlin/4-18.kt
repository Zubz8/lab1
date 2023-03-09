import java.util.Scanner

fun isArranged(n: Int): Boolean {
    var a = n % 10
    var b: Int
    var left = true
    var right = n / 10

    while (right != 0) {
        b = a
        a = right % 10
        right /= 10
        if (b < a) {
            left = false
            break
        }
    }
    return left
}

fun main() {
    val sc = Scanner(System.`in`)
    print("put n: ")
    val n = sc.nextInt()

    if (isArranged(n)) {
        println("arranged")
    } else {
        println("not arranged")
    }
}