package collections

fun main(args: Array<String>) {
  val strings = arrayListOf("Carro", "Moto", "Aviao")

  for (item in strings) {
    println(item.toUpperCase()) //type inference
  }
}