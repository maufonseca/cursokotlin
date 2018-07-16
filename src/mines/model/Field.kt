package mines.model

data class Field(val line: Int, val column: Int) {
  private val neighbours = ArrayList<Field>()
  private val callbacks = ArrayList<(Field, FieldEvent) -> Unit>() //array de funcoes a serem disparadas
  var marked = false
  var open = false
  var bombed = false

  val unmarked: Boolean get() = !marked
  val closed: Boolean get() = !open
  val secure: Boolean get() = !bombed

  val doneObjective: Boolean get() = secure && open || bombed && marked
  val bombedNeighboursQuantity: Int get() = neighbours.filter { it.bombed }.size
  val secureNeighborhood: Boolean
    get() = neighbours.map { it.secure }.reduce{ result, secure -> result && secure }

  fun addNeighbour(neighbour: Field) {
    neighbours.add(neighbour)
  }

  fun onEvent(callback: (Field, FieldEvent) -> Unit) {
    callbacks.add(callback)
  }

  fun open() {
    if(closed) {
      open = true
      if(bombed) {
        callbacks.forEach { it(this, FieldEvent.EXPLOSION) }
      } else {
        callbacks.forEach{ it(this, FieldEvent.OPEN)}
        neighbours.filter { it.closed && it.secure && secureNeighborhood }.forEach{ it.open() }
      }
    }
  }

  fun changeMark() {
    if(closed) {
      marked = !marked
      val event = if(marked) FieldEvent.MARK else FieldEvent.UNMARK
      callbacks.forEach { it(this, event) }
    }
  }

  fun bomb() {
    bombed = true
  }

  fun restart() {
    open = false
    bombed = false
    marked = false
    callbacks.forEach { it(this, FieldEvent.RESTART) }
  }
}