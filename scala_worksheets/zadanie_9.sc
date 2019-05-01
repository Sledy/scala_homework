import scala.util.Random

var mySequence: List[Int] = List.range(1, 100)


def addTen(inputList: List[Int]): List[Int] = {
    return inputList.map(_+1)

}

addTen(mySequence)
