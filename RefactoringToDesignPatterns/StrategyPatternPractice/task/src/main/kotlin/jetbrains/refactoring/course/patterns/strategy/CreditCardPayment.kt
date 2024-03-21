package jetbrains.refactoring.course.patterns.strategy

// TODO
class CreditCardPayment : PaymentStrategy {
    override fun processPayment(amount: Double) =
        println("Processing credit card payment: $amount")
}