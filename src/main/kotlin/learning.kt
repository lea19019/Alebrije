fun main() {
    // List and Arrays
    var luckyNumbers = listOf(1,2,5,7,9,34)

    var nums = arrayOf(2,6,7,8)

    // If you want to create an empty array of numbers let's say you do the following
    var nums2 = arrayOf<Int>()

    // You can add and remove elements from this list
    var listOfNums = mutableListOf(1,2,3)
    listOfNums.add(5) // Built in function to add to the list
    println(listOfNums)

    var favMovies = mutableListOf("Batman","Captain America","Dark")
    println(favMovies[0])

    // For loops
    for (x in 1..10){
        println(x)
    }
    var favCandy = listOf("Snickers", "100 grand bar", "Fun Dip")
    for (x in favCandy){
        println(x)
    }

    for (num in 1..20 step 2) {
        println(num)
    }

    // Maps
    var dogs = mapOf("Fido" to 8, "Sarah" to 17, "Sean" to 6) // This is not mutable

    println(dogs["Fido"])

    var cats = mutableMapOf("kat" to 10, "rosy" to 15) // This is a mutable map

    cats["jeremy"] = 52 // We added the cat jeremy with an age of 52

    println(cats)

    var words = mapOf("chido" to "something is cool", "chale" to "too many meanings", "camara" to "bye")

    println(words)

}