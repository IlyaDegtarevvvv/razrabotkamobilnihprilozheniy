fun main() {
    print("Введите два числа (a и b): ")
    val (a, b) = readln().split(" ").map { it.toInt() }

    println(if (b % a == 0) "$a является делителем $b" else "$a не является делителем $b")
}