import GeneratorTruck.unLoadedTruck
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce


suspend fun main() = coroutineScope {
    println("Start")
    val get = unLoadedTruck()
    get.consumeEach { truck -> println("Truck Random  $truck") }

    //delay(100)
    cancel()
    println("End")

//   runBlocking {
//       val storage: Truck = TruckHighLoad()
//       storage.getProductFromStorage(rightProduct = null)
//       println(storage)
//   }
}






