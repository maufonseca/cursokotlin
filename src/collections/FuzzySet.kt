package collections

fun Any.print() = println(this) //extesion ao Any que eh o pai dos metodos basicos

fun main(args: Array<String>) {
  val set = hashSetOf(3, 'a', "texto", true, 3.14)
  //set.get(1) impossivle pq nao eh indexado o set
  set.add(3).print() //nao aceita duplicacao
  set.add(10).print() //nao esta no consjunto, entao adiciona
  set.size.print()
  set.remove("a").print() //string
  set.remove('a' ).print() //char
  set.contains("texto")

  val nums = setOf(1,2,3)
  //nums.add(4) nao adiciona pq setOf eh somente leitura

  (set+nums).print() //nao repete o 3
  (set-nums).print() //remove o 3
  set.intersect(nums).print() //nao muda o conjunto, cria um novo
  set.retainAll(nums) //muda o conjunto
  set.print()

}