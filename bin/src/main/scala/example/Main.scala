package example;

import org.scalajs.dom
import org.scalajs.dom.document

object Main {

def main(args: Array[String]): Unit = {
    val msg = "Hello world!"
    document.getElementById("canvas").textContent = msg
    println(msg)
  }
}
