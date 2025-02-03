fun main() {
    print("Введите двузначное число: ")
    val num = readln().toInt()

    val firstDigit = num / 10
    val secondDigit = num % 10

    println(if (firstDigit > secondDigit) "Первая цифра больше" else "Вторая цифра больше")
    println(if (firstDigit == secondDigit) "Цифры одинаковые" else "Цифры разные")
}
