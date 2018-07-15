package lambdas

data class House(var address: String = "", var num: Int = 0)

fun main(args: Array<String>) {
  var home = House()

  home.run {
    address = "Rua tal"
    num = 1234
  }

  println(home)
}