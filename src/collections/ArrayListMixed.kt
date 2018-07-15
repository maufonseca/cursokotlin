package collections

fun main(args: Array<String>) {
  var array = arrayListOf("Mae", 1, "Pai", null, 3.4)

  for (item in array) {
    if (item is String) { //smartCast
      println(item.toUpperCase())
    } else {
      println(item)
    }
  }
}