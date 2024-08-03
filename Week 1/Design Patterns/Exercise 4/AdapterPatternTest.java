public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of different payment gateways
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();
        Square square = new Square();

        // Create adapter instances
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        PaymentProcessor squareProcessor = new SquareAdapter(square);

        // Process payments through the adapters
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
        squareProcessor.processPayment(300.0);
    }
}
