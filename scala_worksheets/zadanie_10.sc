def retAbsoluteValue(inputList: List[Double]): List[Double] = {
  var myList = inputList.filter( x => x >= -5 && x <= 12)
  myList = myList.map(math.abs)

  return myList
}

val dataSet = List(-5.0,-4.5,-3,0.0,1.5,3,10.1,13.0)

retAbsoluteValue(dataSet)