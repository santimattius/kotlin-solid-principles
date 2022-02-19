package open_closed_principle.end

interface Vehicle {
    fun draw()
}

class Car : Vehicle {
    override fun draw() {}
}

class MotorBike : Vehicle {
    override fun draw() {}
}

fun draw(vehicle: Vehicle) {
    vehicle.draw()
}

fun main() {
    val car = Car()
    draw(car)

    val motorBike = MotorBike()
    draw(motorBike)
}