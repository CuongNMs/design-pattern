package strategy.paystrategy;

import strategy.paytype.Credit;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class PayByCredit implements PayStrategy {
    private Credit credit;
    private static final Set<Credit> listCredit = new HashSet<>();
    static {
        listCredit.add(new Credit("1", "2020/01/01", BigDecimal.valueOf(1000000)));
        listCredit.add(new Credit("2", "2020/01/01", BigDecimal.valueOf(2000000)));
        listCredit.add(new Credit("3", "2020/01/01", BigDecimal.valueOf(3000000)));
    }
    public PayByCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public boolean pay(int paymentAmount) {
        Credit creditGetFromDB = verify(credit);
        if(creditGetFromDB != null && creditGetFromDB.getAmount().compareTo(BigDecimal.valueOf(paymentAmount)) > 0){
            creditGetFromDB.setAmount(creditGetFromDB.getAmount().subtract(BigDecimal.valueOf(paymentAmount)));
            System.out.println("Payment by credit success");
            return true;
        }
        return false;
    }

    private Credit verify(Credit credit) {
        for (Credit cre: listCredit) {
            if(cre.getNumber().equals(credit.getNumber())){
                return cre;
            }
        }
        return null;
    }

}
