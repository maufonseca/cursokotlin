package objectoriented.inheritance

open class Animal(val name: String)

class Dog: Animal { //nao uso o construtor aqui

  private val height: Double

  constructor(name: String, height: Double) : super(name) { //chama o construtor aqui
    this.height = height
  }

  constructor(name: String) : this(name, 0.0) //chamando o construtor acima, nessa mesma classe

  override fun toString(): String = "$name has height of $height."
}

fun main(args: Array<String>) {
  val dogAlemao = Dog("Dogao",1.0)
  val chiuahua = Dog("Small")

  println(dogAlemao)
  println(chiuahua)
}