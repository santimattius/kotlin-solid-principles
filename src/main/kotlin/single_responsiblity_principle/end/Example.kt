package single_responsiblity_principle.end

data class Vehicle(
    val wheelCount: Int,
    val maxSpeed: Int
)

class VehiclePrinter {

    fun print(vehicle: Vehicle) = with(vehicle) {
        println("wheelCount: $wheelCount, maxSpeed:$maxSpeed")
    }
}

fun main() {
    val vehicle = Vehicle(wheelCount = 4, maxSpeed = 120)
    val printer = VehiclePrinter()
    printer.print(vehicle)
}