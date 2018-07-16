package mines.model

import java.util.*

class Panel(val lineQuantity: Int, val columnQuantity: Int, private val bombQuantity: Int) {
  private val fields = ArrayList<ArrayList<Field>>()
  private val callbacks = ArrayList<(PanelEvent) -> Unit>()

  init {
    generateFields()
    associateNeighbours()
    raffleBombs()
  }

  private fun generateFields() {
    for (line in 0 until lineQuantity) {
      fields.add(ArrayList())
      for(column in 0 until columnQuantity) {
        val newField = Field(line, column)
        newField.onEvent(this::verifyMatchObjective)
        fields[line].add(newField)
      }
    }
  }

  private fun associateNeighbours() {
    forEachField { associateNeighbours(it) }
  }

  private fun associateNeighbours(field: Field) {
    val (line, column) = field
    val lines = arrayOf(line-1, line, line+1)
    val columns = arrayOf(column-1, column, column+1)

    //removendo as linhas e colunas das beiradas
    lines.forEach { l ->
      columns.forEach { c ->
        val current = fields.getOrNull(l)?.getOrNull(c)
        current?.takeIf { field != it  }?.let { field.addNeighbour(it) } //ve se nao eh o proprio campo
      }
    }
  }

  private fun raffleBombs() {
    val generator = Random()

    var raffledLine = -1
    var raffledColumn = -1
    var currentBombQuantity = 0

    while (currentBombQuantity < this.bombQuantity) {
      raffledLine = generator.nextInt(lineQuantity)
      raffledColumn = generator.nextInt(columnQuantity)

      val raffledField = fields[raffledLine][raffledColumn]
      if(raffledField.secure) {
        raffledField.bomb()
        currentBombQuantity++
      }

    }
  }

  private fun matchObjective(): Boolean {
    var playerVictory = true
    forEachField { if (!it.doneObjective) playerVictory = false }
    return playerVictory
  }

  private fun verifyMatchObjective(field: Field, event: FieldEvent) {
    if(event==FieldEvent.EXPLOSION) {
      callbacks.forEach { it(PanelEvent.DEFEAT) }
    } else if (matchObjective()) {
      callbacks.forEach { it(PanelEvent.VICTORY) }
    }
  }

  fun forEachField(callback: (Field) -> Unit) {
    fields.forEach { it.forEach(callback) }
  }

  fun onEvent(callback: (PanelEvent) -> Unit) {
    callbacks.add(callback)
  }

  fun restart() {
    forEachField { it.restart() }
    raffleBombs()
  }


}