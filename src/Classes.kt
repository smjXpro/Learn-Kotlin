//class Car constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}

class Car(val make: String, val model: String, var color: String) {
    fun accelerate() {
        println("vroom vroom")
    }

    fun details() {
        println("This is $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("Taking the horses to the rodeo")
    }

    fun details() {
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }
}

fun main(args: Array<String>) {
    val car = Car("Toyota", "Avalon", "Red")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ford", "F-150", 1000)
    truck.tow()
    truck.details()
}