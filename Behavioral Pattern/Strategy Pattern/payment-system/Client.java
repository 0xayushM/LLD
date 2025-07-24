// PaymentContext
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    } 
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount){
        paymentStrategy.pay(amount);
    }
}

// PaymentStrategy
interface PaymentStrategy {
    void pay(int amount);
}

// CreditCardPaymentStrategy
class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount){
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// PaypalPaymentStrategy
class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount){
        System.out.println("Paid " + amount + " using Paypal");
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPaymentStrategy());
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new PaypalPaymentStrategy());
        paymentContext.pay(200);
    }
}

