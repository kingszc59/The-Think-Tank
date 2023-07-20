//Part 1: Functions

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int): Int {
    return  x * y
}

fun divide(x: Int, y: Int): Int {
    return x / y
}

fun subtract(x: Int, y: Int): Int {
    return x - y
}

//Part 2: Classes

class Employee(firstName: String, lastName: String, age: Int) {

    var firstName: String = firstName
    var lastName: String = lastName
    var age: Int = age

    fun printDetails() {
        println("Employee Details: First Name: $firstName, Last Name: $lastName, Age: $age")
    }
}

class Manager(firstName: String, lastName: String, age: Int, teamSize: Int) : Employee(firstName, lastName, age) {

    var teamSize: Int = teamSize

    override fun printDetails() {
        println("Manager Details: First Name: $firstName, Last Name: $lastName, Age: $age, Team Size: $teamSize")
    }
}

//Part 3: Data Structures

data class Point(val x: Double, val y: Double)

val points = listOf(
        Point(2.0, 3.0),
        Point(3.0, 7.0),
        Point(4.0, 9.0)
)

//Part 4: Interfaces

interface Shape {
    fun draw()
}

class Circle(val radius: Double): Shape {
    override fun draw() {
        println("Drawing circle of radius: $radius")
    }
}

class Square(val sideLength: Double): Shape {
    override fun draw() {
        println("Drawing square of side length: $sideLength")
    }
}

//Part 5: Exceptions

class NotFoundException(message: String): Exception(message)

fun getUserByID(id: Int): String {
    if (id == 0) {
        throw NotFoundException("User not found")
    }
    return "User #$id"
}

//Part 6: Lambdas

val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
val multiplyLambda: (Int, Int) -> Int = { x, y -> x * y }
val divideLambda: (Int, Int) -> Int = { x, y -> x / y }
val subtractLambda: (Int, Int) -> Int = { x, y -> x - y }