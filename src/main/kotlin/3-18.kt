import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    println("put the first coefficient of the strait line:")
    val a = scan.nextDouble()
    val b = scan.nextDouble()
    val c = scan.nextDouble()
    val set1 = Triple(a,b,c)
    println("put the second coefficient of the strait line:")
    val d = scan.nextDouble()
    val e = scan.nextDouble()
    val f = scan.nextDouble()
    val set2 = Triple(d,e,f)
    println("put the third coefficient of the strait line:")
    val g = scan.nextDouble()
    val h = scan.nextDouble()
    val i = scan.nextDouble()
    val set3 = Triple(g,h,i)

    val yea = seeAll(set1,set2, set3)
    if (yea == 0.0) {
        println("Three lines intersect at one point")
    } else {
        println("Three lines do not intersect at one point")
    }
}
fun seeAll(set1: Triple<Double, Double, Double>, set2:Triple<Double, Double, Double>, set3: Triple<Double,Double,Double>):Double {
    val (a, b, c) = set1
    val (d,e, f) = set2
    val (g,h,i) = set3
    val yea = (a * e * i + b * f * g + c * d * h - c * e * g - a * f * h - b * d * i)
    return yea
}
