class Cat {
    var name: String

    constructor(name: String) {
        this.name = name
    }
    fun printName() {
        println(this.name)
    }
}

fun main() {

    // Functions

    fun hello(){
        println("Hello World!")
    }
    hello()
    hello()
    hello()

    // You can specify the type of variable you want your function to return by adding it after the function name
    fun sayBye(): String {
        return "Bye"
    }
    println(sayBye())

    // This is how you would pass parameters
    fun myNameGreet(name: String = "Bruce"):String { // You can also place default parameters
        return "Hi, my name is $name"
    }
    println(myNameGreet("Vicente"))
    println(myNameGreet())


//    fun addNums(num1: Int, num2: Int): Int {
//        return  num1 + num2
//    }

    // The function above is equal to the following
    fun addNumbers(num1: Int, num2: Int) = num1 + num2

    // Challenge
    fun dogData(name: String, age: Int) {
        println("The dog $name is $age years old, and he loves cookies")
    }

    dogData("Polar", 1)
    dogData("Skipper", 3)

    // Classes
    class Dog {
        var name: String // There are several ways to initialize classes, this is one
        var age: Int
        var furColor: String
        constructor(name: String, age: Int, furColor: String) { // Constructors with parameters
            this.name = name
            this.age = age
            this.furColor = furColor
        }
        // You can also create empty constructors
        constructor() {
            name = ""
            age = 0
            furColor = ""
        }
        fun dogInfo() {
            println("$name is $age years old and is color $furColor")
        }
    }
    var myDog = Dog("Maqui", 3, "white")
    myDog.dogInfo()

    // Nullable
    // You can set variables to be nullable by adding the ? right after the variable data type
    var age: Int? = 28
    age = null

    var cat = Cat(name = "Don Gato")
    cat.printName()


}