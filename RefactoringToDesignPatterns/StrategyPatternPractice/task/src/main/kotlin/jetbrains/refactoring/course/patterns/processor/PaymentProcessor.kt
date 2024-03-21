package jetbrains.refactoring.course.patterns.processor

import jetbrains.refactoring.course.patterns.strategy.PaymentStrategy

// TODO
class PaymentProcessor(private val paymentStrategy: PaymentStrategy) {
    fun processOrderPayment(amount: Double) =
        paymentStrategy.processPayment(amount)
}