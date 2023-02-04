class TruckHighLoad : Truck(20000, 600) {

    fun create() {
        println("Тяжелый грузовик: Параметры: Грузоподъемность $maxLoadCapacity Время $parkingTime")
    }

    override fun loadedTruck() {

    }

    override fun unLoadedTruck() {

    }
}