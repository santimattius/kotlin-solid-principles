package liskov_substitution.end

open class Animal {
    open fun walk() {}
}

open class LightweightAnimal : Animal() {
    fun jump() {}
}

class Cat : LightweightAnimal()

class Elephant : Animal()

fun jumpHole(animal: LightweightAnimal) {
    animal.walk()
    animal.jump()
    animal.walk()
}

fun main() {

    jumpHole(Cat())

}