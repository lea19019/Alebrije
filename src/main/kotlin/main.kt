// Imports that will help us to read text files
import java.io.File
import java.io.InputStream

// Class created to hold our Alebrije information
class Alebrije {
    // Variables containing strings, integers and booleans
    var name: String? = ""
    var age: Int = 0
    var home : String? = ""
    var isGood: Boolean = true

    // These are types of collections in Kotlin, lists
    var hobbies = mutableListOf<String?>("","")
    var habilities = mutableListOf<String?>("","")

}

// Function created to request the Alebrije data from user
fun getAlebrijeData(alebrije: Alebrije){

    print("What is the name of your alebrije: ")
    alebrije.name = readLine() // readLine() will get the input from the user

    print("How old is you alebrije: ")
    alebrije.age = Integer.valueOf(readLine())

    print("Where does you alebrije lives? ")
    alebrije.home = readLine()

    var answer: String?
    // Representation of a while loop in Kotlin
    do {
        print("Is he good? (Y/N) ")
        answer = readLine()

        if (answer == "N" || answer == "n")
            alebrije.isGood = false
    } while (answer != "Y" && answer != "y" && answer != "N" &&  answer != "n")
    // We just want a yes or no, we will check for the user to input that

    println("Mention 2 of its hobbies")
    // Representation of a for loop in Kotlin
    for (x in 0..1) {
        print("Hobby: ")
        alebrije.hobbies[x] = readLine()
    }

    println("Mention 2 of its abilities")
    for (x in 0..1) {
        print("Ability: ")
        alebrije.habilities[x] = readLine()
    }   // You can access to a list values with square brackets like other
        // programming languages
    print("\n")

}

// Function to display our story
fun displayStory(alebrije: Alebrije) {
    // Another collection in Kotlin, a map
    // It contains values that will be use to replace data in the text file
    val alebrijeMap = mapOf(
        "_name" to alebrije.name,
        "_home" to alebrije.home,
        "_age" to alebrije.age,
        "_hobby1" to alebrije.hobbies[0],
        "_hobby2" to alebrije.hobbies[1],
        "_ability1" to alebrije.habilities[0],
        "_ability2" to alebrije.habilities[1]
    )

    // File path saved in these variable
    val pathText = "src/main/kotlin/alebrije.txt"

    // We pass our path to bring our file in the code
    val inputStream: InputStream = File(pathText).inputStream()
    val lineList = mutableListOf<String>()

    // Let's read our text inside the file
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    lineList.forEach{
        var result = it
        // Inside the text there are special characters that will allow us identify those
        // words we want to replace with our Alebrije data
        alebrijeMap.forEach { (text, keys) -> result = result.replace(text, keys.toString()) }
        println("> " + result) // Display our story
    }

    // Representation of if statement with an else in Kotlin
    if (alebrije.isGood) {
        println("> He loves humans, and whenever people is in \n"
                + "> trouble he comes to help them.")
    }
    else {
        println("> Despite his magnificence you must be careful, \n"
                + "> he does not like people very much.")
    }
}

fun letsPlay () {
    var playAgain = "Y"

    do {
        // We created an alebrije with a type of class Alebrije
        val alebrije = Alebrije()

        // Let's prompt the user for the Alerbije's data
        getAlebrijeData(alebrije)

        // Let's show our story!
        displayStory(alebrije)

        print("\nPress any key to play again or \"Q\" to quit the game: ")
        playAgain = readLine().toString()
        print("\n")
    } while(playAgain != "Q" && playAgain != "q")
}

// Main function to call our other functions and do the magic
fun main() {
    println("\n\t\t\t\tAlebrijes\n" +
            "In the last century a mexican craftsman came up with\n" +
            "a revolutionary idea, he started creating alebrijes. \n" +
            "These are creatures that can be anything you can\n" +
            "imagine every alebrije created is unique, and you\n" +
            "will create yoursright now.\n")

    letsPlay()

    println("Thanks for playing! Have a nice day!")
}
