var myList: List[Int] = List(1,2,3,4,0,6,8,0,8,0,0,502516,15,1452,-511,6525)
val mynonZeroList = myList.filter(_ != 0)
println("Lista przefiltrowana: " + mynonZeroList)