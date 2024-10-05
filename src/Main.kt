// двухмерный масисв
//fun main() {
//    val assessments = Array(20) { IntArray(10) }
//    for (i in 0 until 20) {
//        for (j in 0 until 10) {
//            assessments[i][j] = (2..5).random() // случайная оценка от 1 до 10
//        }
//    }
//    var Sum = 0
//    for (i in 0 until 20) {
//        for (j in 0 until 10) {
//            Sum += assessments[i][j]
//            print("${assessments[i][j]} ")
//        }
//        println()
//    }
//    val average  = Sum.toDouble() / (20 * 10)
//    println("Средняя оценка класса: $average ")
//}

//одномерный массив
import kotlin.random.Random
fun main() {
    val size = 10
    val numbers = IntArray(size) { Random.nextInt(1, 10) }
    println("массив: ${numbers.joinToString(", ")}")
    print("введите число a: ")
    val a = readLine()?.toInt() ?: return
    val Last = LastElement(numbers)
    val Count = Count(numbers, a)
    println("оличество элементов, отличных от последнего элемента: $Last")
    println("количество элементов, кратных $a: $Count")
}
fun LastElement(numbers: IntArray): Int {
    val lastElement = numbers.last()
    return numbers.count { number -> number != lastElement }
}
fun Count(numbers: IntArray, a: Int): Int {
    return numbers.count { number -> number % a == 0 }
}