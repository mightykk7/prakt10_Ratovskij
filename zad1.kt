fun main() {
    // Выводим результат
    println("Ноутбук")
    println(Laptop("Intel Core i7",3600,16000, 1000).Info())
    // Вычисляем и выводим общее качество
    var totalQuality = Laptop("Intel Core i7",3600,16000, 1000).calculateTotalQuality()
    println("Общее качество компьютера: $totalQuality")
    println()
    println("Игровой компьютер")
    println(PlayComputer("Intel Core i9",4000,32000, 1500).Info())
    totalQuality = PlayComputer("Intel Core i9",4000,32000, 1500).calculateTotalQuality()
    println("Общее качество компьютера: $totalQuality")
    println()
    println("Игровой ноутбук")
    println(PlayLaptop("Intel Core i9",4000,24000, 1250).Info())
    totalQuality = PlayLaptop("Intel Core i9",4000,24000, 1250).calculateTotalQuality()
    println("Общее качество компьютера: $totalQuality")
}