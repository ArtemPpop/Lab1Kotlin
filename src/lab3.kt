////Задание 1
open class Time(var hours: Int = 0, var minutes: Int = 0, var seconds: Int = 0) {

    fun totalMinutes(): Int {
        return hours * 60 + minutes
    }

    fun reduceTime(minutesToReduce: Int) {
        var totalMinutes = totalMinutes() - minutesToReduce
        if (totalMinutes < 0) {
            totalMinutes = 0
        }

        hours = totalMinutes / 60
        minutes = totalMinutes % 60
        seconds = 0 
    }


    fun displayTime(): String {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds)
    }
}
//fun main() {
//
//    val timeInstance = Time(1, 30, 45) // 1 час, 30 минут, 45 секунд
//    println("Исходное время: ${timeInstance.displayTime()}")
//
//    val fullMinutes = timeInstance.totalMinutes()
//    println("Количество полных минут: $fullMinutes")
//
//    timeInstance.reduceTime(10) // Уменьшаем время на 10 минут
//    println("Время после уменьшения на 10 минут: ${timeInstance.displayTime()}")
//}

//задание 2


class Descendant(
    var lastName: String,
    var operator: String,
    var currentTime: Time
) : Time() {

    fun isDiscountTime(): Boolean {
        return currentTime.hours in 0..7  
    }


    fun displayDescendantInfo(): String {
        return "Абонент: $lastName, Оператор: $operator, Текущее время: ${currentTime.displayTime()}"
    }
}

fun main() {

    val timeInstance = Time(7, 30, 0) 
    val descendant = Descendant("Иванов", "МТС", timeInstance) 

    println(descendant.displayDescendantInfo())

    if (descendant.isDiscountTime()) {
        println("время льготное")
    } else {
        println("время не льготное")
    }
}

//задание 3

