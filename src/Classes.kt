open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
        super.accelerate()
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("headed out to the mountains!")
    }
}

fun main(args: Array<String>) {
    val tesla = Car("Tesla", "ModelS", "Color")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 1000)
    truck.tow()

}