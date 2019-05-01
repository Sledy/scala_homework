val weekDays: List[String] = List("poniedzialek", "wtorek",
  "sroda", "czwartek", "piatek", "sobota", "niedziela");


def simpleForLoop(my_list: List[String]) : Unit ={
  println("Zadanie 1a");
  for (a <- my_list.indices){
      println(my_list(a));
  }
}


def simpleLoopOnlyP(my_list: List[String]) : Unit ={
    println("Zadanie 1b");
    for (a <- my_list.indices){

    if(my_list(a).charAt(0) == 'p') {
      println(my_list(a));
    }

  }
}

def printWithForeach(my_list: List[String]) : Unit = {
    println("Zadanie 1c");
    my_list.foreach{println};
}


def printWhileLoop(my_list: List[String]) : Unit = {
  println("Zadanie 1d");
  var counter: Int = 0;
  while(counter < my_list.length){
    println(my_list(counter));
    counter+=1;
  }
}

def recursivePrinting(number : Int) : Unit = {
  println("Zadanie 1e")

  if (number == weekDays.length){
    return;
  }

  println(weekDays(number));

  recursivePrinting(number+1)

}


def reverseRecursivePrinting(number : Int): Unit ={
  if (number == 0){
    println("Zadanie 1f")

    return;
  }

  println(weekDays(number));

  reverseRecursivePrinting(number-1)

}


def foldLeftPrint() ={
  println("Zadanie 1g")
  println(weekDays.foldLeft(""){(z,f) => z + " " + f});

}

def foldRightPrint()={
  println("Zadanie 1g")
  println(weekDays.foldRight(""){(z,f) => z + " " + f})
}


def filterFold()={
  println("Zadanie 1h")

  val filterDays=(weekDays.filter(_.startsWith("p")).foldRight(""){(z,f) => z + " " + f})
  println(filterDays)
}





simpleForLoop(weekDays);
simpleLoopOnlyP(weekDays);
printWithForeach(weekDays);
printWhileLoop(weekDays);
recursivePrinting(0);
reverseRecursivePrinting(weekDays.length-1)
foldLeftPrint()
foldRightPrint()
filterFold()

