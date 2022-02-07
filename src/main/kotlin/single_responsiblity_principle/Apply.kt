package single_responsiblity_principle

data class Vehicle2(
    val wheelCount: Int,
    val maxSpeed: Int
)

class VehiclePrinter {

    fun print(vehicle2: Vehicle2) = with(vehicle2) {
        println("wheelCount: $wheelCount, maxSpeed:$maxSpeed")
    }
}

fun main() {
    val vehicle = Vehicle2(wheelCount = 4, maxSpeed = 120)
    val printer = VehiclePrinter()
    printer.print(vehicle)
}