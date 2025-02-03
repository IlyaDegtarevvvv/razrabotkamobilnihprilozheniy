fun main() {
    print("Введите три числа: ")
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    val max = maxOf(a, b, c)

    println("Максимальное число: $max")
}