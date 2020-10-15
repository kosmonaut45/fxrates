package lt.augustas.fxrates.task.soap;

import lt.augustas.fxrates.task.entity.FxCurrency;
import lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult;
import org.apache.axis.message.MessageElement;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

@Component
public class FetchFxCurrenciesService extends BaseFxRatesService {

    public List<FxCurrency> fetchFxCurrencies() throws ServiceException, RemoteException {
        GetCurrencyListResponseGetCurrencyListResult response = getFxRatesSoap().getCurrencyList();
        List<FxCurrency> currencies = new LinkedList<>();
        for (MessageElement string : response.get_any()) {
            FxCurrency currency;
            for (int i = 0; i < string.getElementsByTagName("CcyNtry").getLength(); i++) {
                currency = createFxCurrencyFromNode(string.getElementsByTagName("CcyNtry").item(i).getChildNodes());
                currencies.add(currency);
            }
        }
        return currencies;
    }
}
