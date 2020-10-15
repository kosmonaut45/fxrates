package lt.augustas.fxrates.task.entity;

import java.math.BigDecimal;

public class Exchange {

    private BigDecimal rate;

    private BigDecimal value;

    public Exchange(BigDecimal rate, BigDecimal value) {
        this.rate = rate;
        this.value = value;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "currency='" + rate + '\'' +
                ", value=" + value +
                '}';
    }
}
