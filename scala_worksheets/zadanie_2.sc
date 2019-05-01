val productsMap = Map("pralka" -> 2000.0, "telewizor" -> 3000.0, "monitor" -> 650.0)
val resultMap = productsMap.transform((k,v) => v *0.9);

println(resultMap)
//OR

val resultMap2 = productsMap.mapValues(_*0.9);