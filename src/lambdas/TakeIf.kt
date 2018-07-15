package lambdas

fun main(args: Array<String>) {
  print("Entre a mensagem: ")

  val input = readLine()
  val msg = input.takeIf { it?.trim() != "" } ?: "Sem mensagem"

  println(msg)
}