package example

import java.util.NoSuchElementException

object Lists {

  /**
    * This method computes the sum of all elements in the list xs. There are
    * multiple techniques that can be used for implementing this method, and
    * you will learn during the class.
    *
    * For this example assignment you can use the following methods in class
    * `List`:
    *
    *  - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
    *  - `xs.head: Int` returns the head element of the list `xs`. If the list
    *    is empty an exception is thrown
    *  - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
    *    list `xs` without its `head` element
    *
    *  ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
    *  solution.
    *
    * @param xs A list of natural numbers
    * @return The sum of all elements in `xs`
    */
  def sum(xs: List[Int]): Int = {
    if (xs.isEmpty) { 0 } else {
      sumRec(xs, xs.size)
    }
  }

  private def sumRec(xs: List[Int], size: Int): Int = {
    if (1 == size) {
      xs.head
    } else {
      xs(size - 1) + sumRec(xs, size - 1)
    }
  }

  /**
    * This method returns the largest element in a list of integers. If the
    * list `xs` is empty it throws a `java.util.NoSuchElementException`.
    *
    * You can use the same methods of the class `List` as mentioned above.
    *
    * ''Hint:'' Again, think of a recursive solution instead of using looping
    * constructs. You might need to define an auxiliary method.
    *
    * @param xs A list of natural numbers
    * @return The largest element in `xs`
    * @throws java.util.NoSuchElementException if `xs` is an empty list
    */
  def max(xs: List[Int]): Int = {
    val ex = new NoSuchElementException("Empty list")
    if (xs.isEmpty) throw ex
    maxRec(xs, xs.size)
  }

  private def maxRec(xs: List[Int], size: Int): Int = {
    if (size == 1) {
      xs.head
    } else {
      max(xs(size - 1), maxRec(xs, size - 1))
    }
  }

  private def max(num1: Int, num2: Int): Int = {
    if (num1 > num2) {
      num1
    } else {
      num2
    }
  }
}
