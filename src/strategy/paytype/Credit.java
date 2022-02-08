package strategy.paytype;

import java.math.BigDecimal;

public class Credit {
    private String number;
    private String date;
    private BigDecimal amount;

    public Credit(String number, String date, BigDecimal amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
