fun main() {
    print("Введите три стороны треугольника: ")
    val (a, b, c) = readln().split(" ").map { it.toDouble() }

    if (a + b > c && a + c > b && b + c > a) {
        println("Треугольник возможен")
    } else {
        println("Треугольник невозможен")
    }
}