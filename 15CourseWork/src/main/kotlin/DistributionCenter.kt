


class DistributionCenter(
    private val numberOfUnloadingPorts: Int,
    private val numberOfLoadingPorts: Int
) {
    //Это список разгрузочных портов. Во время работы программы, в каждом порту находится или машина или null.
    private val unloadingPorts =
        MutableList<Truck?>(numberOfUnloadingPorts) { null }
    //Это список загрузочных портов. В каждом порту находится или машина или null.
    private val loadingPorts =
        MutableList<Truck?>(numberOfLoadingPorts) { null }

    private val storage = ArrayList<Product>()

    fun unload(truck: Truck) {


    }

    fun upload(truck: Truck) {

    }


}