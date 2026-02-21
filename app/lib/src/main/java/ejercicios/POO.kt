package ejercicios

class Person(val name: String, val age: Int, val language: String) {

    fun sayHello() {
        if (language == "Spanish") {
            println("Hola soy $name y tengo $age años")
        } else {
            println("Hello soy $name y tengo $age años")
        }
    }

    fun caminar(): Double {
        return 10.0
    }
}

// Abstracción
abstract class Shape {
    abstract fun calculateArea(): Double
}

class Square(val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}

class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    val person = Person("Ari G", 20, "Spanish")
    person.sayHello()

    val square = Square(10.0)
    val circle = Circle(10.0)

    val shapes = listOf(square, circle)

    for (shape in shapes) {
        println(shape.calculateArea())
    }
}