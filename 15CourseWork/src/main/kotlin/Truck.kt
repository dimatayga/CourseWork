
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

open class Truck(val maxLoadCapacity: Int, val parkingTime: Long) {

    open fun loadedTruck() {}

    open fun unLoadedTruck() {
        println("")

    }


    //Это хранилище всех товаров.
    private val storageArea = mutableListOf<Product>()

    private val mutex = Mutex()

    //функция берет со склада необходимый для погрузки продукт
   open suspend fun getProductFromStorage(rightProduct: Product?): Product? {
        mutex.withLock {
            if (rightProduct in storageArea) {
                storageArea.remove(rightProduct)
                println("товар ${rightProduct?.name}")
                return rightProduct
            }
            return null
        }
    }

}