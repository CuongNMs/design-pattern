package strategy.manager;

import strategy.paystrategy.PayStrategy;

public class Order {
    private PayStrategy payStrategy;


    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }


    public PayStrategy getPayStrategy() {
        return payStrategy;
    }
}
