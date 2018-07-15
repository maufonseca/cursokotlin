package collections

fun main(args: Array<String>) {
  val strings = arrayListOf("Carro", "Moto", "Aviao")

  for (item in strings) {
    println(item)
  }

  //usando o operador destructuring
  for((index, item) in strings.withIndex()) {
    println("$index - $item")
  }
}