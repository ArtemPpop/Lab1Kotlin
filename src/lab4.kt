//задание через list
//fun main() {
//    
//    val numbers = listOf(1, 3, 5, 4, 2, 9, 7, 6, 8, 10)
//
//    
//    val count = numbers.indices.count { index ->
//        index in 1 until numbers.size - 1 && 
//                numbers[index] > numbers[index - 1] && 
//                numbers[index] > numbers[index + 1]    
//    }
//
//    
//    println("Количество элементов которые больше двух соседних: $count")
//}

//задание ерез set
//fun main() {
//   
//    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
//
//   
//    val anjaCubes = mutableSetOf<Int>()
//    repeat(N) {
//        anjaCubes.add(readLine()!!.toInt())
//    }
//
//   
//    val boryaCubes = mutableSetOf<Int>()
//    repeat(M) {
//        boryaCubes.add(readLine()!!.toInt())
//    }
//
//   
//    val commonColors = anjaCubes.intersect(boryaCubes).sorted()
//    val onlyAnjaColors = anjaCubes.subtract(boryaCubes).sorted()
//    val onlyBoryaColors = boryaCubes.subtract(anjaCubes).sorted()
//
//    
//    println("${commonColors.size} ${commonColors.joinToString(" ")}")
//    println("${onlyAnjaColors.size} ${onlyAnjaColors.joinToString(" ")}")
//    println("${onlyBoryaColors.size} ${onlyBoryaColors.joinToString(" ")}")
//}

//задание через map
fun main() {

    val N = readLine()!!.toInt()

 
    val filePermissions = mutableMapOf<String, MutableSet<String>>()


    repeat(N) {
        val input = readLine()!!.split(' ')
        val fileName = input[0]
        val operations = input.drop(1).toSet() 
        filePermissions[fileName] = operations.toMutableSet()
    }


    val M = readLine()!!.toInt()


    repeat(M) {
        val request = readLine()!!.split(' ')
        val operation = request[0]
        val fileName = request[1]

        if (filePermissions.containsKey(fileName) && filePermissions[fileName]?.contains(operation) == true) {
            println("OK")
        } else {
            println("Access denied")
        }
    }
}


















