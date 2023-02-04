import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlin.random.Random
import kotlin.random.nextInt

object GeneratorTruck {

    fun generatorTruck(): Truck {
        // var maxLoadCapacity = 10000
        //  var parkingTime: Long = 700
        when ((1..3).random()) {
            1 -> TruckHighLoad().create()
            2 -> TruckMediumLoad().create()
            3 -> TruckSmallLoad().create()
        }
       println("LLL")
        return Truck(0, 0)
    }


    private lateinit var truck: Truck

    @OptIn(ExperimentalCoroutinesApi::class)
    fun CoroutineScope.unLoadedTruck(): ReceiveChannel<Truck> = produce {
        while (isActive) {
            truck = when (Random.nextInt(1..3)) {
                1 -> TruckSmallLoad()
                2 -> TruckMediumLoad()
                else -> TruckHighLoad()
            }
            truck.getProductFromStorage(rightProduct = null)
            // truck.fillRandomGoods()
            send(truck)
            delay(1)

        }

    }


}