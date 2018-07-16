package mines.presentation

import mines.model.Panel
import mines.model.PanelEvent
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.SwingUtilities
import javax.swing.WindowConstants

fun main(args: Array<String>) {
  Main()
}

class Main: JFrame() {
  private val panel = Panel(16, 30, 5)
  private val canvas = Canvas(panel)

  init {
    panel.onEvent(this::showResult)
    add(canvas)

    setSize(700, 500)
    setLocationRelativeTo(null)
    defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    title = "Bombs!"
    isVisible = true
  }

  private fun showResult(event: PanelEvent) {
    SwingUtilities.invokeLater {
      val msg = when(event) {
        PanelEvent.VICTORY -> "You Win!"
        PanelEvent.DEFEAT -> "You Lose!"
      }

      JOptionPane.showMessageDialog(this, msg)
      panel.restart()
      canvas.repaint()
      canvas.validate()

    }
  }
}