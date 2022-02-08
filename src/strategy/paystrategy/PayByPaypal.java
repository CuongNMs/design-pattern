package strategy.paystrategy;

import strategy.paytype.Paypal;

import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy {
    private Paypal paypal;
    private static final Map<String, String> PAYPAL_DATABASE = new HashMap<>();
    static {
        PAYPAL_DATABASE.put("UserA", "passworda");
        PAYPAL_DATABASE.put("UserB", "passwordb");
    }

    public PayByPaypal(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if(verify(paypal)){
            System.out.println("Payment by paypal success!");
        }
        return false;
    }

    private boolean verify(Paypal paypal) {
        if(PAYPAL_DATABASE.containsKey(paypal.getUsername().trim())){
            if(PAYPAL_DATABASE.get(paypal.getUsername()).equals(paypal.getPassword())){
                return true;
            }
        }
        return false;
    }


}
