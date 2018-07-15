package collections

class Objeto(val nome: String, val descricao: String) {
  override fun hashCode(): Int {
    //usado para uma comparacao mais rapida na estrutura hash.
    //deve ser deterministico, e nao randomico, senao nunca acharemos o objeto na colecao
    return nome.length
  }

  override fun equals(other: Any?) = if(other is Objeto) { //equals é mais demorado, soh executa sobre os hashcodes validos
      nome.equals(other.nome, ignoreCase = true)
    } else {
      false
    }
}

fun main(args: Array<String>) {
  val conjunto = hashSetOf(
      Objeto("Cadeira", "..."), //hashcode = 7
      Objeto("Mesa", "..."), //hashcode = 4
      Objeto("Faca", "...") //hashcode = 4
  )

  conjunto.contains(Objeto("faca", "???")).print()
}