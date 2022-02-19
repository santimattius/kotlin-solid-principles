package open_closed_principle.started

class Vehicle(val type: VehicleType)

enum class VehicleType {
    CAR, MOTORBIKE
}

fun draw(vehicle: Vehicle) {
    when (vehicle.type) {
        VehicleType.CAR -> drawCar(vehicle)
        VehicleType.MOTORBIKE -> drawMotorBike(vehicle)
    }
}

fun drawMotorBike(vehicle: Vehicle) {
    println(vehicle.type)
}

fun drawCar(vehicle: Vehicle) {
    println(vehicle.type)
}

fun main() {
    val vehicle = Vehicle(VehicleType.CAR)
    draw(vehicle)
}