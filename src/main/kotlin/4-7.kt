import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("put a here: ")
    val a = scan.nextDouble()
    var i = 1
    var number = 1.0
    println("$i %.4f ${number > a}".format(number))

    while (number <= a) {
        i++
        number += 1.0 / i
        println("$i %.4f ${number > a}".format(number))
    }
    println("\nFirst number of the sequence > a = $number")
}