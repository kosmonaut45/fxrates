package lt.augustas.fxrates.task.entity.database;

import javax.persistence.*;

@Entity
@Table(name = "fxCurrency")
public class FxCurrencyDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currencyCode;

    private String currencyName;

    public FxCurrencyDAO() {
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Long getId() {
        return id;
    }
}
