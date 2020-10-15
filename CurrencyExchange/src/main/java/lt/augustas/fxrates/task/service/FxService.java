package lt.augustas.fxrates.task.service;

import lt.augustas.fxrates.task.entity.Exchange;
import lt.augustas.fxrates.task.entity.FxCurrency;
import lt.augustas.fxrates.task.entity.FxRate;
import lt.augustas.fxrates.task.entity.database.FxCurrencyDAO;
import lt.augustas.fxrates.task.entity.database.FxRateDAO;
import lt.augustas.fxrates.task.repository.FxCurrencyRepository;
import lt.augustas.fxrates.task.repository.FxRateRepository;
import lt.augustas.fxrates.task.util.FxHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FxService {

    private final FxRateRepository fxRateRepository;

    private final FxCurrencyRepository fxCurrencyRepository;

    private final FxHelper fxHelper;

    @Autowired
    public FxService(FxRateRepository fxRateRepository, FxCurrencyRepository fxCurrencyRepository, FxHelper fxHelper) {
        this.fxRateRepository = fxRateRepository;
        this.fxCurrencyRepository = fxCurrencyRepository;
        this.fxHelper = fxHelper;
    }

    public List<FxRate> fetchFxRates() {
        return fxHelper.remapDAO(fxRateRepository.findAll());
    }

    public List<FxCurrency> fetchFxCurrencies() {
        List<FxRateDAO> currentRates = fxRateRepository.findAll();
        List<FxCurrencyDAO> currencies = fxCurrencyRepository.findAll();
        return fxHelper.filterCurrencies(currentRates, currencies);
    }

    public Exchange calculateFxExchange(String currencyCode, BigDecimal amount) {
        FxRateDAO rate = fxRateRepository.getByExchangeCurrency(currencyCode);
        BigDecimal exchangeRate = rate.getExchangeValue();
        BigDecimal value = exchangeRate.multiply(amount).setScale(4, BigDecimal.ROUND_CEILING);
        return new Exchange(rate.getExchangeValue(), value);
    }


}
