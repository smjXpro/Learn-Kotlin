fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }

//    fun printMessage(message: String){
//        println(message)
//    }

    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))

    val sumB: (Int, Int) -> Int = { x, y -> x + y }

    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there were no network errors

        completion()
    }

    // call downloadData function
    downloadData("fakeurl.com", {
        println(
            "The code in this block will only run" +
                    "after the completion()"
        )
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeurl.com") { car ->
        println(car.color)
        println(car.make)
    }

    downloadCarData("fakeurl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckrData(url: String, completion: (Truck?, Boolean) -> Unit) {
        val wbRequestSuccess = true

        if (wbRequestSuccess) {

            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckrData("fakeurl.com") { truck, success ->
        if (success == true) {
            truck?.tow()
        } else {
            println("Something went wrong")
        }
    }
}