fun main() {
    print("Введите два числа (m и n): ")
    val (m, n) = readln().split(" ").map { it.toInt() }

    if (m % n == 0) {
        println("Частное: ${m / n}")
    } else {
        println("m на n нацело не делится")
    }
}