/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.File;

object Main {
  def main(args: Array[String]){
    println("IntSorter")
    val answer = new IntBubbleSorter().sort(Array(1,2,3,4,5,4,3,2,1))
    answer.foreach(println)

    println("StringSorter")
    val answer2 = new StringBubbleSorter().sort(Array("15", "2", "03", "a", "A", "B", "あ", "漢字"))
    answer2.foreach(println)
  }
}
