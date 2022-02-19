package liskov_substitution.started

open class Animal {
    open fun walk() {}
    open fun jump() {}
}

fun jumpHole(animal: Animal) {
    animal.walk()
    animal.jump()
    animal.walk()
}

class Elephant : Animal() {
    override fun jump() {
        throw Exception("No jump support!!")
    }
}

fun main() {
    jumpHole(Animal())

    // launch exception
    jumpHole(Elephant())
}