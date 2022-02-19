package dependency_inversion.end

interface Monitor
class LedMonitor : Monitor
class LcdMonitor : Monitor

interface KeyBoard
class StandardKeyboard : KeyBoard
class MechanicalKeyboard : KeyBoard

class Windows98Machine(
    private val keyboard: KeyBoard,
    private val monitor: Monitor
)

fun main() {
    val machine1 = Windows98Machine(StandardKeyboard(), LedMonitor())
    val machine2 = Windows98Machine(MechanicalKeyboard(), LcdMonitor())
}