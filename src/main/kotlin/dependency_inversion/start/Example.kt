package dependency_inversion.start

class Monitor
class StandardKeyboard

class Windows98Machine {
    //This is problem, example change keyboard for Mechanical Keyboard
    private val keyboard: StandardKeyboard = StandardKeyboard()
    private val monitor: Monitor = Monitor()
}

fun main() {
    val machine = Windows98Machine()
}