package lambdas

class Calculator {

  //metodo padrao
  fun calculate(a: Double, b: Double): Double {
    return a+b
  }

  //sobrecarga do metodo padrao passando a funcao desejada
  fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
    return operation(a,b) //use o lambda para agir sobre A e B
  }
}

fun main(args: Array<String>) {
  val calculator = Calculator()
  val result1 = calculator.calculate(10.0,3.0) //usando o padrao

  //criando um lambda e armazenando numa constante
  val multiplication = {x: Double, y: Double ->
    x*y
  }

  //passando o lambda criado junto como parametro
  val result2 = calculator.calculate(10.0, 3.0, multiplication)

  print("$result1, $result2")

}