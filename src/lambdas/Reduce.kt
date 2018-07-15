package lambdas

class Product(val name: String, val price: Double)

val products = listOf(
    Product("Fichario",21.90),
    Product("Estojo", 11.90),
    Product("Borracha",0.99)
)

fun main(args: Array<String>) {
  //armazenando lambda na constant
  val totalize = { total: Double, actual: Double ->
    total+actual //return
  }

  //o resultado da funcao reduce é passado para a proxima func como acumulador
  val totalPrice = products.map { it.price }.reduce(totalize) //agregador retorna um double

  println("O preco medio é R$ ${totalPrice/ products.size}.")
}