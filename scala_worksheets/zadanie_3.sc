def function(argTuple : (_, _, _)): Unit ={
  argTuple.productIterator.foreach{println};
}

val my_tuple = Tuple3("String", 1, 3.5677);
function(my_tuple)