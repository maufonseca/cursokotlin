package collections

fun main(args: Array<String>) {
  val numbers = Array<Int>(10) {//lambda de inicialização
    i -> i*10
  }

  for (item in numbers) {
    print("$item ")
  }

  println("\n"+numbers.size)
  println(numbers[3])
}