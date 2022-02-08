package strategy;


import strategy.manager.Order;
import strategy.paytype.Paypal;
import strategy.paystrategy.PayByPaypal;
import strategy.paystrategy.PayStrategy;

public class Demo {
    public static void main(String[] args) {
        Order order = new Order();
        PayStrategy paypal = new PayByPaypal(new Paypal("UserA", "passworda"));
        order.setPayStrategy(paypal);
        order.getPayStrategy().pay(5000);
    }
}
