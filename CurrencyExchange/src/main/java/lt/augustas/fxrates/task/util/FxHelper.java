package lt.augustas.fxrates.task.util;

import lt.augustas.fxrates.task.entity.FxCurrency;
import lt.augustas.fxrates.task.entity.FxRate;
import lt.augustas.fxrates.task.entity.database.FxCurrencyDAO;
import lt.augustas.fxrates.task.entity.database.FxRateDAO;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class FxHelper {

    public FxCurrency remapDAO(FxCurrencyDAO dao) {
        FxCurrency currency = new FxCurrency();
        currency.setCurrencyName(dao.getCurrencyName());
        currency.setCurrencyCode(dao.getCurrencyCode());
        return currency;
    }

    public List<FxRate> remapDAO(List<FxRateDAO> daos) {
        List<FxRate> rates = new LinkedList<>();
        for (FxRateDAO dao: daos) {
            FxRate rate = new FxRate();
            rate.setExchangeCurrency(dao.getExchangeCurrency());
            rate.setExchangeValue(dao.getExchangeValue());
            rate.setCurrency(dao.getDate());
            rate.setDate(dao.getCurrency());
            rates.add(rate);
        }
        return rates;
    }

    public List<FxCurrency> filterCurrencies(List<FxRateDAO> currentRates, List<FxCurrencyDAO> currencies) {
        List<FxCurrency> response = new LinkedList<>();
        for (FxCurrencyDAO currency: currencies) {
            for (FxRateDAO rate : currentRates) {
                if(rate.getExchangeCurrency().equals(currency.getCurrencyCode())) {
                    response.add(remapDAO(currency));
                }
            }
        }
        return response;
    }
}
