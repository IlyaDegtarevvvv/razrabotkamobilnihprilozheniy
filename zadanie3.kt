fun main() {
    print("Введите два числа: ")
    val (a, b) = readln().split(" ").map { it.toInt() }

    val odd = if (a % 2 != 0) a else b
    println("Нечетное число: $odd")
}