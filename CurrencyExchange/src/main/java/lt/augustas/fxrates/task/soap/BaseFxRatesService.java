package lt.augustas.fxrates.task.soap;

import lt.augustas.fxrates.task.entity.FxCurrency;
import lt.augustas.fxrates.task.entity.FxRate;
import lt.lb.www.WebServices.FxRates.FxRatesLocator;
import lt.lb.www.WebServices.FxRates.FxRatesSoap;
import org.w3c.dom.NodeList;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;

public abstract class BaseFxRatesService {

    static final String RATE_TYPE = "EU";

    FxRate createFxRateFromNode(NodeList nodes) {
        FxRate rate = new FxRate();
        rate.setCurrency(nodes.item(0).getFirstChild().getNodeValue());
        rate.setDate(nodes.item(1).getFirstChild().getNodeValue());
        rate.setExchangeCurrency(nodes.item(3).getFirstChild().getFirstChild().getNodeValue());
        rate.setExchangeValue(convertNumber(nodes.item(3).getLastChild().getFirstChild().getNodeValue()));
        return rate;
    }

    FxCurrency createFxCurrencyFromNode(NodeList nodes) {
        FxCurrency currency = new FxCurrency();
        currency.setCurrencyCode(nodes.item(0).getFirstChild().getNodeValue());
        currency.setCurrencyName(nodes.item(2).getFirstChild().getNodeValue());
        return currency;
    }

    FxRatesSoap getFxRatesSoap() throws ServiceException {
        FxRatesLocator locator = new FxRatesLocator();
        return locator.getFxRatesSoap();
    }

    private BigDecimal convertNumber(String number) {
        Double temp = Double.valueOf(number);
        return BigDecimal.valueOf(temp);
    }


}
