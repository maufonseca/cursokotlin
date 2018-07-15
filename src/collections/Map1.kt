package collections

fun main(args: Array<String>) {
  var map = HashMap<Long, String>()

  map.put(12312312332, "João")
  map.put(12312312350, "Pedro")
  map.put(12312312332, "João Filho")

  for (pair in map.entries) {
    println(pair)
  }

  for (name in map.values) {
    println(name)
  }

  for (key in map.keys) {
    println(key)
  }

  for ((cpf, name) in map) {
    println("$name (CPF: $cpf)")
  }

  map.size.print()
  map.get(987)?.print()
  map[876]?.print()
  map.contains(97).print()
  map.remove(876)?.print()
}