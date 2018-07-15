package lambdas

fun main(args: Array<String>) {
  val students = arrayListOf("Pedro", "Michelle", "Maurício")
  students.map { it.toUpperCase() }.apply { println(this) } //not attributing to any constant, using apply directly

}