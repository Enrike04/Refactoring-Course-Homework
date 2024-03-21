package jetbrains.refactoring.course.patterns.strategy

// TODO
class PayPalPayment : PaymentStrategy {
    override fun processPayment(amount: Double) =
        println("Processing PayPal payment: $amount")
}