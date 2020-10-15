package lt.augustas.fxrates.task.entity.database;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "fxRate")
public class FxRateDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String currency;
    String date;
    String exchangeCurrency;
    @Column(precision = 11, scale = 5)
    BigDecimal exchangeValue;

    public FxRateDAO() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExchangeCurrency() {
        return exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public BigDecimal getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(BigDecimal exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

}