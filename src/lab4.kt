//задание через list
//fun main() {
//    println("Введите числа через пробел:")
//    val numbers = readLine()!!.split(' ').map { it.toInt() }
//    val count = numbers.indices.count { index ->
//        index in 1 until numbers.size - 1 &&
//                numbers[index] > numbers[index - 1] &&
//                numbers[index] > numbers[index + 1]
//    }
//    println("Количество элементов, которые больше двух соседних: $count")
//}

//задание ерез set
fun main() {

    println("Введите количество кубиков у Ани и Бориса (N M):")
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val anjaCubes = mutableSetOf<String>()
    println("Введите $N цвета кубиков Ани:")
    repeat(N) {
        anjaCubes.add(readLine()!!)
    }
    val boryaCubes = mutableSetOf<String>()
    println("Введите $M цвета кубиков Бориса:")
    repeat(M) {
        boryaCubes.add(readLine()!!)
    }
    val commonColors = anjaCubes.intersect(boryaCubes).sorted()
    val onlyAnjaColors = anjaCubes.subtract(boryaCubes).sorted()
    val onlyBoryaColors = boryaCubes.subtract(anjaCubes).sorted()

    println("${commonColors.size} ${commonColors.joinToString(" ")}")
    println("${onlyAnjaColors.size} ${onlyAnjaColors.joinToString(" ")}")
    println("${onlyBoryaColors.size} ${onlyBoryaColors.joinToString(" ")}")
}

//задание через map
fun main() {


}


















