package advanced

class Box<G>(val objeto: G) {
  private val objects = ArrayList<G>()

  init {
    adicionar(objeto)
  }

  fun adicionar(newObject: G) {
    objects.add(newObject)
  }

  override fun toString(): String = objects.toString()
}

fun main(args: Array<String>) {
  val schoolBox = Box("Caneta")
  schoolBox.adicionar("Pulseira")
  println(schoolBox)

  val numbers = Box(1)
  numbers.adicionar(4)
  println(numbers)
}