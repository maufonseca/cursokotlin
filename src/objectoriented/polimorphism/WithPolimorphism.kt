package objectoriented.polimorphism

open class Food(val weight: Double)

class Bean(weight: Double): Food(weight)
class Rice(weight: Double): Food(weight)
class Egg (weight: Double): Food(weight)

class Person(var weight: Double) {

  fun eat(food: Food) {
    weight += food.weight
  }
}

fun main(args: Array<String>) {

  val bean = Bean(0.4)
  val rice = Rice(0.3)
  val egg = Egg(0.2)

  val joao = Person(80.0)

  joao.eat(bean)
  joao.eat(rice)

  println(joao.weight)

}