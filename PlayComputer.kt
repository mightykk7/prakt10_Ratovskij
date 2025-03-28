open class PlayComputer(processorName: String, clockSpeed: Int, memory: Int, val storageCapacity: Int) : Computers(processorName, clockSpeed, memory), StorageDevice {
    // Метод для вычисления общего качества компьютера
    fun calculateTotalQuality(): Double {
        val baseQuality = calculateBaseQuality()
        val additionalQuality = calculateAdditionalQuality(baseQuality, storageCapacity)
        return additionalQuality
    }
}