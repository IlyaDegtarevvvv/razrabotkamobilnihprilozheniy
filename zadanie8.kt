fun main() {
    print("Введите расстояния (в километрах и футах): ")
    val (km, ft) = readln().split(" ").map { it.toDouble() }

    val metersFromKm = km * 1000
    val metersFromFt = ft * 0.305

    println(if (metersFromKm < metersFromFt) "Километры меньше" else "Футы меньше")
}