package objectoriented.inheritance

interface SportCar {
  var turbo: Boolean

  fun startTurbo() { turbo = true } //implementacao padrao

  fun stopTurbo() { turbo = false } //implementacao padrao
}