data class Product(
    val name: String,
    val foodOrNot: Boolean,
    val breakingCargo: Boolean,
    val weight: Double,
    val timeLoading: Int,
)


object ProductList {
    val largeItem = mutableListOf(
        Product("TV", foodOrNot = false, breakingCargo = true, 25.0, 5),
        Product("Fridge", foodOrNot = false, breakingCargo = true, 30.0, 7)
    )

    val mediumItem = mutableListOf(
        Product("Table", foodOrNot = false, breakingCargo = false, 10.0, 3),
        Product("Seat", foodOrNot = false, breakingCargo = false, 3.0, 2),
        Product("Hanger", foodOrNot = false, breakingCargo = false, 1.5, 1)
    )

    val smallItem = mutableListOf(
        Product("Telephone", foodOrNot = false, breakingCargo = true, 2.0, 2),
        Product("Notebook", foodOrNot = false, breakingCargo = true, weight = 4.0, timeLoading = 4)
    )

    val foodItem = mutableListOf(
        Product("Bananas", foodOrNot = true, breakingCargo = false, weight = 15.0, timeLoading = 6),
        Product("Orange", foodOrNot = true, breakingCargo = false, weight = 23.0, timeLoading = 11),
        Product("Apple", foodOrNot = true, breakingCargo = false, weight = 29.0, timeLoading = 19),
        Product("Sugar", foodOrNot = true, breakingCargo = false, weight = 50.0, timeLoading = 20),
        Product("Flour", foodOrNot = true, breakingCargo = false, weight = 50.0, timeLoading = 20),
    )

}
