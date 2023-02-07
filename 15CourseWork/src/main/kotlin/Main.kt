import GeneratorTruck.unLoadedTruck
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield


suspend fun main() = coroutineScope {

//    val get = unLoadedTruck()
//    get.consumeEach { truck -> println("Truck Random  $truck") }
//    println("Start")
//    delay(100)
//    yield()
//    println("End")
for (i in 1..50) {
    val storage = Truck(0, 0).getProductFromStorage(Product("k",
        foodOrNot = false,
        breakingCargo = false,
        weight = 1.1,
        timeLoading = 1
    ))
    println(storage)
}





}
