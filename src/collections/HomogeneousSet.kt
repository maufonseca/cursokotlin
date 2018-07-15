package collections

fun main(args: Array<String>) {
  val approved = hashSetOf("Joao", "Maria", "Amaral", "Pedro")

  for (name in approved) {
    name.print()
  }

  val linked = linkedSetOf("Joao", "Maria", "Amaral", "Pedro")

  for (name in linked) name.print()

  approved.sortedBy { it.reversed() }.print()

}