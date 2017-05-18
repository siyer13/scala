// Banking app
class BankAccount {
  private var bal: Int = 0

  def balance: Int = bal

  def deposit(amount: Int): String = {
    require(amount > 0)
    bal += amount
    "$"+amount+" deposited to your account"
  }

  def withdraw(amount: Int): Boolean =
    if(amount > bal) false
    else {
      bal -= amount
      true
    }
}


val account = new BankAccount

println(account deposit 1000)
println(account withdraw 500)
