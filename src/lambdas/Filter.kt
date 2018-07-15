package lambdas

data class Student(val name: String, val grade: Double)

fun main(args: Array<String>) {
  val students = arrayListOf(
      Student("Pedro", 6.75),
      Student("Michelle", 5.7),
      Student("Monica",3.6))

  val approved = students.filter { it.grade >= 5.0 }.sortedBy { it.name }
  println(approved)
}