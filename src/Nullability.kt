fun main(args: Array<String>) {

    var name: String = "SMJ"
//    name = null

    var nullableName: String? = "Do I really exist?"
//    nullableName = null


    // Null Check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }

//    println(nullableName.length)
    println(length)

    val l = if (nullableName != null) nullableName.length else -1


    // Safe Call Operator "?"

    println(nullableName?.length)

    // Elvis Operator

    val len = nullableName?.length ?: -1

    val noName = nullableName ?: "No one knows me..."

    println(noName)

    // !!
    println(nullableName!!.length)
}