fun main(args: Array<String>) {
    // Comments in Kotlin
    // To declare a variable just start with var, no int or char or data type is needed
    var age = 23
    age = 30  // You can also reassign variable with typing the name and writing the equal sign

    // To declare an immutable variable use val
    val anotherAge = 25

    // You can also specify the data-type
    val favCandy: String = "Snicker"

    // This is interpolation in Kotlin
    println("I am $age years old, I fear to reach $anotherAge and my favorite candy is $favCandy")

    var name = "Vicente"
    /*
    This is how to make multiline comments
     */

    var radius = 6
    var pi = 3.14
    var c = radius * pi * 2 // Kotlin is smart enough to make the conversion from different types of numbers
    var c2: Int = radius * pi.toInt() * 2 // You can also change the data type

    // Both print and println will output the text, but println will print the next line
    print(c)
    print('\n') // This is how you print a new line with text
    println(c2)

    // You can also do the + - equals
    var wallet = 45
    wallet -= 5
    println(wallet)
    wallet += 15
    println(wallet)

    var myAge = 23
    myAge += 40
    /*
    I hopefully be retired in 40 years
     */

    var isTheDogAlive = true

    if (isTheDogAlive) {
        /*
        Logical operators
        < less than
        > greater than
        <= less than or equal to
        >= greater or equal to
        == equal to
        != NOT
        && AND
        || OR
         */
    }

    var myName = "Adrian"

    if (myName == "Nick") {
        println("Sucker")
    } else {
        println("$myName you rock!")
    }

    println("\tthis is a tab")

}

