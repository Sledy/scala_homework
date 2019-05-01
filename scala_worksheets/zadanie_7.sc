case class Osoba(imie: String, nazwisko: String){
}

val adam = Osoba("Adam", "Sledziewski")
val kuba =  Osoba("Kuba", "Kowalski")
val random =  Osoba("random", "random")


def matchOsoba(o: Osoba) = o match {
  case Osoba("Adam", "Sledziewski") => "Czesc Adam"
  case Osoba("Kuba", "Kowalski") => "Czesc Kuba"
  case Osoba(imie, nazwisko) => s"Czesc $imie"
}

matchOsoba(adam)
matchOsoba(kuba)
matchOsoba(random)



