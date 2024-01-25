import java.util.*

fun pairs(k: Int, arr: Array<Int>): Int {
    val numSet = arr.toSet()
    var count = 0

    for (num in numSet) {
        if (num + k in numSet) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = pairs(k, arr)
    println(result)
}
