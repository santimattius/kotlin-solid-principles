package single_responsiblity_principle.started

class Vehicle(
    private val wheelCount: Int,
    private val maxSpeed: Int
) {
    fun print() {
        println("wheelCount: $wheelCount, maxSpeed:$maxSpeed")
    }
}

fun main() {
    val vehicle = Vehicle(wheelCount = 4, maxSpeed = 120)
    vehicle.print()
}