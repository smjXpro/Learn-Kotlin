fun main(args: Array<String>) {
    val str = "May the force be with you." //escaped string
    println(str)

    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMMMM
    """.trimMargin()  //raw string

    println(rawCrawl)

    //Following are string operations

//    for (char in str){
//        println(char)
//    }

    val contentEquals = str.contentEquals(rawCrawl)
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()

    println(uppercase)
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subSubsequence = str.subSequence(4, 13)
    println(subSubsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println(luke + " has a " + lightSaberColor) //old way
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old") //new way (string template)
    println("Lukes full name $luke has ${luke.length} characters")


}