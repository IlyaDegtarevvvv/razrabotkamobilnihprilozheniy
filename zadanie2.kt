fun main() {
    print("Введите три числа: ")
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    if (a == b || a == c || b == c) {
        println("Ошибка")
    } else {
        val middle = listOf(a, b, c).sorted()[1]
        println("Среднее число: $middle")
    }
}