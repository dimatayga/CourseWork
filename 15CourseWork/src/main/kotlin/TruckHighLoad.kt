class TruckHighLoad : Truck(20000, 600) {

    fun create(truck: Truck): String {
        println("Тяжелый грузовик: Параметры: Грузоподъемность $maxLoadCapacity Время $parkingTime")
        return ""
    }

    override fun loadedTruck() {

    }

    override fun unLoadedTruck() {

    }
}