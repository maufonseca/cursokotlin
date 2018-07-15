package objectoriented.polimorphism

class Bean2(val weight: Double)

class Rice2(val weight: Double)

class Person2(var weight: Double) {

  fun eat(bean: Bean2) {
    weight += bean.weight
  }

  fun eat(rice: Rice2) {
    weight += rice.weight
  }
}

fun main(args: Array<String>) {

  val bean = Bean2(0.4)

  val rice = Rice2(0.3)

  val joao = Person2(80.0)

  joao.eat(bean)
  joao.eat(rice)

  println(joao.weight)

}