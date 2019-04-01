fun main(args: Array<String>) {


    //immutable array
    val imperials = listOf("Emperror", "Darth Vader", "Boba Fett", "Tarkin")

    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Emperror"))
    println(imperials.contains("Luke"))

    //mutable array
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)


    //maps

    //immutable maps
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))
    println(rebelVehiclesMap.values)

    //mutable maps
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Bobba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles)
}