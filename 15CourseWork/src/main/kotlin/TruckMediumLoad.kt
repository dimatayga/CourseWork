class TruckMediumLoad : Truck(15000, 400) {

    override fun loadedTruck() {
        super.loadedTruck()
    }

    override fun unLoadedTruck() {
        super.unLoadedTruck()
    }

    fun create() {
        println("Средний  грузовик : Параметры: Грузоподъемность $maxLoadCapacity Время $parkingTime")
    }
}
