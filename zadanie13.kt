fun main() {
    print("Введите четырехзначное число: ")
    val num = readln().toInt()

    val d1 = (num / 1000) % 10
    val d2 = (num / 100) % 10
    val d3 = (num / 10) % 10
    val d4 = num % 10

    val sumFirstTwo = d1 + d2
    val sumLastTwo = d3 + d4
    val sumAll = sumFirstTwo + sumLastTwo
    val productAll = d1 * d2 * d3 * d4

    println(if (sumFirstTwo == sumLastTwo) "Сумма первых двух цифр равна сумме последних" else "Суммы не равны")
    println(if (sumAll % 3 == 0) "Сумма цифр кратна 3" else "Сумма цифр не кратна 3")
    println(if (productAll % 4 == 0) "Произведение цифр кратно 4" else "Произведение цифр не кратно 4")

    print("Введите число a: ")
    val a = readln().toInt()
    println(if (productAll % a == 0) "Произведение цифр кратно $a" else "Произведение цифр не кратно $a")
}