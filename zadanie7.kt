fun main() {
    print("Введите два числа: ")
    val (a, b) = readln().split(" ").map { it.toDouble() }

    println("Большее число: ${maxOf(a, b)}")
    println("Меньшее число: ${minOf(a, b)}")
}
