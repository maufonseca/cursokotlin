package lambdas

fun main(args: Array<String>) {
  val listWithNulls : List<String?> = listOf("A", null, "Casa", "Seta", null, null, "Mauricio")

  for(item in listWithNulls) {
    item?.let { println(it) }
  }
}