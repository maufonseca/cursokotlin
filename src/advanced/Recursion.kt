package advanced

fun fatorial(num:Int): Int {
  return when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> fatorial(num - 1) * num
    else -> throw IllegalArgumentException("Numero negativo nao tem fatorial")
  }
}

fun main(args: Array<String>) {
  println(fatorial(3))
}