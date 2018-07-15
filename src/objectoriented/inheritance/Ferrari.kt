package objectoriented.inheritance

class Ferrari: Car(maxSpeed = 350), SportCar {
  override var turbo: Boolean = false

  override fun accelerate() {
    changeSpeed(if (turbo) 50 else 25)
  }

  override fun brake() {
    changeSpeed(-25)
  }
}