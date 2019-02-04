package example

import scala.util.{Failure, Success, Try}

object Main extends App {
  println(Lists.sum(List(1, 3, 2)))
  println(Lists.sum(List()))

  println(Lists.max(List(1, 3, 2)))
  Try {
    println(Lists.max(List()))
  } match {
    case Success(_) =>
    case Failure(ex) =>
      println(ex.getMessage)
  }

}
