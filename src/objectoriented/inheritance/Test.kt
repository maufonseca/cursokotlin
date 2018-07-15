package objectoriented.inheritance

fun main(args: Array<String>) {
  val car = Ferrari()
  car.accelerate()
  car.startTurbo()
  car.accelerate()
  car.brake()

  println(car)
}