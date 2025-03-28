abstract class Computers (
    val processorName: String,
    val clockSpeed: Int,
    val memory: Int
) {
    // Метод для вычисления качества базового класса Q
    fun calculateBaseQuality(): Double {
        return (0.1 * clockSpeed) + memory
    }
    open fun Info():String = "Наименование процессора: $processorName" +
        "\nТактовая частота процессора: ${clockSpeed / 1000.0} ГГц (${clockSpeed} МГц)" +
        "\nОбъем оперативной памяти: ${memory / 1024} ГБ (${memory} МБ)"
}