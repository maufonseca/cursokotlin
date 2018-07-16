package advanced

data class Point(val x: Int, val y: Int) {

  //sobrecarregando operators
  operator fun plus(other: Point) = Point(x+other.x, y+other.y)
  operator fun unaryMinus() = Point(-x, -y)
}

fun main(args: Array<String>) {
  val point1 = Point(1,1)
  val point2 = Point(2,2)

  println(-point1)
  println(point1+point2)
}