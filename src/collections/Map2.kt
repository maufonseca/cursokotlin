package collections

fun main(args: Array<String>) {
  val map = hashMapOf(
      1 to "Mauricio",
      2 to "Maria",
      3 to "Pedro")

  map.forEach{it.print()}
}