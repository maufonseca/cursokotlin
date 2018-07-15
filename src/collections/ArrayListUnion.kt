package collections

fun main(args: Array<String>) {

  val numeros = arrayListOf(1,2,3,4,5)
  val strings = arrayListOf("Pedro", "Mauricio", "Maria")
  val uniao = numeros + strings //sobrecarga de operadores +soma e +concat

  for (item in uniao) {
    println(item)
  }
}