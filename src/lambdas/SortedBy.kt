package lambdas

fun main(args: Array<String>) {
  val names = arrayListOf("Mauricio", "Michelle", "Pedro", "André")

  val order1 = names.sortedBy { it }.reversed()
  println(order1)
}