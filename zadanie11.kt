fun main() {
    print("Введите число: ")
    val num = readln().toInt()

    println(if (num % 2 == 0) "Число четное" else "Число нечетное")
    println(if (num % 10 == 7) "Число оканчивается на 7" else "Число не оканчивается на 7")
}