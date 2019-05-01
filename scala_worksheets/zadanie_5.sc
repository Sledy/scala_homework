
def recognizeDay(s: String) = s match  {
  case `s` if s matches "(?i)poniedzialek" => "Praca"
  case `s` if s matches "(?i)wtorek" => "Praca"
  case `s` if s matches "(?i)sroda" => "Praca"
  case `s` if s matches "(?i)czwartek" => "Praca"
  case `s` if s matches "(?i)piatek" => "Praca"
  case `s` if s matches "(?i)sobota" => "Weekend"
  case `s` if s matches "(?i)niedziela" => "Weekend"
  case y => "Nie ma takiego dnia"
}


recognizeDay("PoniedZialek")
recognizeDay("niedziELa")