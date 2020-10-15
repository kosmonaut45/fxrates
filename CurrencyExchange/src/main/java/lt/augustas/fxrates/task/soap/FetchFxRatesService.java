package lt.augustas.fxrates.task.soap;

import lt.augustas.fxrates.task.entity.FxRate;
import lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult;
import lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult;
import org.apache.axis.message.MessageElement;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

@Component
public class FetchFxRatesService extends BaseFxRatesService {

    public List<FxRate> fetchLatestFxRates() throws ServiceException, RemoteException {
        GetCurrentFxRatesResponseGetCurrentFxRatesResult response = getFxRatesSoap().getCurrentFxRates(RATE_TYPE);
        return getFxRates(response.get_any());
    }

    public List<FxRate> fetchRatesForCurrency(String currencyCode) throws ServiceException, RemoteException {
        LocalDate toDate = new LocalDate();
        LocalDate fromDate = toDate.minusDays(30);
        GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult response = getFxRatesSoap().getFxRatesForCurrency(RATE_TYPE, currencyCode,fromDate.toString(), toDate.toString());
        return getFxRates(response.get_any());
    }

    private List<FxRate> getFxRates(MessageElement[] elements) {
        List<FxRate> rates = new LinkedList<>();
        for (MessageElement string : elements) {
            FxRate rate;
            for (int i = 0; i < string.getElementsByTagName("FxRate").getLength(); i++) {
                rate = createFxRateFromNode(string.getElementsByTagName("FxRate").item(i).getChildNodes());
                rates.add(rate);
            }
        }
        return rates;
    }
}
