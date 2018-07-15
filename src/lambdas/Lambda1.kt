package lambdas

fun main(args: Array<String>) {

  val soma = { x:Int, y:Int -> x+y } //storing lambda function in constant, last line is the return
  println(soma(4,6)) //using lambda stored in constant as parameter of another func
}