//задание через list
//fun main() {
//    // Пример списка чисел
//    val numbers = listOf(1, 3, 5, 4, 2, 9, 7, 6, 8, 10)
//
//    // Считаем количество элементов, которые больше двух своих соседей
//    val count = numbers.indices.count { index ->
//        index in 1 until numbers.size - 1 && // Исключаем крайние элементы
//                numbers[index] > numbers[index - 1] && // Проверяем, что больше левого соседа
//                numbers[index] > numbers[index + 1]    // Проверяем, что больше правого соседа
//    }
//
//    // Выводим результат
//    println("Количество элементов, которые больше двух своих соседей: $count")
//}

//задание ерез set
//fun main() {
//    // Считываем количество кубиков у Ани и Бори
//    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
//
//    // Считываем цвета кубиков Ани
//    val anjaCubes = mutableSetOf<Int>()
//    repeat(N) {
//        anjaCubes.add(readLine()!!.toInt())
//    }
//
//    // Считываем цвета кубиков Бори
//    val boryaCubes = mutableSetOf<Int>()
//    repeat(M) {
//        boryaCubes.add(readLine()!!.toInt())
//    }
//
//    // Находим пересечения и разности множеств
//    val commonColors = anjaCubes.intersect(boryaCubes).sorted()
//    val onlyAnjaColors = anjaCubes.subtract(boryaCubes).sorted()
//    val onlyBoryaColors = boryaCubes.subtract(anjaCubes).sorted()
//
//    // Выводим количество и сами элементы для каждого множества
//    println("${commonColors.size} ${commonColors.joinToString(" ")}")
//    println("${onlyAnjaColors.size} ${onlyAnjaColors.joinToString(" ")}")
//    println("${onlyBoryaColors.size} ${onlyBoryaColors.joinToString(" ")}")
//}

//задание через map
fun main() {
    // Считываем количество файлов
    val N = readLine()!!.toInt()

    // Создаем Map для хранения прав доступа
    val filePermissions = mutableMapOf<String, MutableSet<String>>()

    // Считываем имена файлов и их операции
    repeat(N) {
        val input = readLine()!!.split(' ')
        val fileName = input[0]
        val operations = input.drop(1).toSet() // Сохраняем операции в Set для быстрого поиска
        filePermissions[fileName] = operations.toMutableSet()
    }

    // Считываем количество запросов
    val M = readLine()!!.toInt()

    // Обрабатываем запросы
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


















