def moneyTransfer(amount: Double, tax: Double, providerFee: (Double,Double) => Double, transCharge: Double => Double): Double = {
 amount + 10 + providerFee(amount, tax) + transCharge(amount)
}
def providerA(money: Double, tax: Double) = money * 0.05 + tax
def providerB(money: Double) = money * 0.10
println(moneyTransfer(100, 10, providerA, providerB))
