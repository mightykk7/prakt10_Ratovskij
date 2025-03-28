interface StorageDevice {
    // Метод для вычисления дополнительного качества Qp
    fun calculateAdditionalQuality(baseQuality: Double, storageCapacity: Int): Double {
        return baseQuality + 0.5 * storageCapacity
    }
}