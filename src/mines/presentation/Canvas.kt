package mines.presentation

import mines.model.Panel
import java.awt.GridLayout
import javax.swing.JPanel

class Canvas(panel: Panel): JPanel() {

  init {
    layout = GridLayout(panel.lineQuantity, panel.columnQuantity)
    panel.forEachField { field ->
      val button = Button(field)
      add(button)
    }
  }

}