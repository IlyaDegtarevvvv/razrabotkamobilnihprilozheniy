fun main() {
    print("Введите два числа (большее и меньшее): ")
    val (a, b) = readln().split(" ").map { it.toInt() }

    if (a % b == 0) {
        println("$a кратно $b")
    } else {
        println("$a не кратно $b, остаток: ${a % b}")
    }
}