public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(100.0);

        // Using PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200.0);
    }
}
