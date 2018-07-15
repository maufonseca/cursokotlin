package collections

data class Fruit(val name: String, val price: Double)

fun main(args: Array<String>) {
  val fruits = arrayListOf(Fruit("Banana", 1.50), Fruit("Orange", 2.5))
  for (fruit in fruits)
    println("${fruit.name} - ${fruit.price}")
  println(fruits.distinctBy { it.price }) //imprime soh se já nao tiver uma com preço igual
}