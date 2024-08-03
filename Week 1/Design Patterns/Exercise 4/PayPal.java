
public class PayPal {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}


public class Stripe {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}


public class Square {
    public void executePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }
}
