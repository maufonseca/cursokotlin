package lambdas

class Calculator2 {
  var result = 0.0

  fun sum(val1: Double, val2: Double) {
    result += val1 + val2
  }

  fun add(val1: Double) {
    result += val1
  }
}

fun main(args: Array<String>) {
  val calculator = Calculator2()
  calculator.apply { add(1.0) }.apply { sum(2.0,2.1) }.apply { println(result) }
  calculator.apply {
    sum(1.0, 2.0)
    add(0.1)
    println(result)
  }
  with(calculator) {
    sum(0.4,5.0)
    println(result)
  }

}