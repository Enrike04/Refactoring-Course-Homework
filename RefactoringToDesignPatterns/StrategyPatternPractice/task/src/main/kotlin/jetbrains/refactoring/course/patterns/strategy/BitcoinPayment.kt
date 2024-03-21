package jetbrains.refactoring.course.patterns.strategy

// TODO
class BitcoinPayment : PaymentStrategy {
    override fun processPayment(amount: Double) =
        println("Processing Bitcoin payment: $amount")
}