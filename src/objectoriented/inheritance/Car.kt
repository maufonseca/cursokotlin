package objectoriented.inheritance

open class Car(val maxSpeed: Int = 200, var currentSpeed: Int = 0) {

  protected fun changeSpeed(speed: Int) {
    val newSpeed = currentSpeed + speed
    currentSpeed = when(newSpeed) {
      in 0..maxSpeed -> newSpeed
      in maxSpeed+1..Int.MAX_VALUE -> maxSpeed
      else -> 0
    }
  }

  open fun accelerate() {
    changeSpeed(5)
  }

  open fun brake() {
    changeSpeed(-5)
  }

  override fun toString(): String {
    return "Velocidade atual: $currentSpeed Km/h"
  }
}