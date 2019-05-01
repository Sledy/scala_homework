class KontoBankowe(){
  private var _stanKonta = 0

  def this(x: Int){
    this()
    this._stanKonta = x
  }

  def stanKonta = _stanKonta

  def wyplata(x: Int): Unit ={
    if (x <= _stanKonta && x>0){
      _stanKonta -= x
    }
    else {
      println("Blad wyplaty")
    }
  }

  def wplata(x: Int): Unit ={
    if (x>0){
      _stanKonta += x
    }
    else{
      println("Nieprawidlowa wartosc wplaty.")
    }
  }

}

var konto = new KontoBankowe()
println("Stan konta: " + konto.stanKonta)
konto.wplata(1000)
println("Stan konta: " + konto.stanKonta)
konto.wyplata(200)
println("Stan konta: " + konto.stanKonta)


