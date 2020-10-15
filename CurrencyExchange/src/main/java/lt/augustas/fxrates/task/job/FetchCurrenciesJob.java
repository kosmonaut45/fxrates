package lt.augustas.fxrates.task.job;

import lt.augustas.fxrates.task.entity.FxCurrency;
import lt.augustas.fxrates.task.entity.database.FxCurrencyDAO;
import lt.augustas.fxrates.task.repository.FxCurrencyRepository;
import lt.augustas.fxrates.task.soap.FetchFxCurrenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

@Component
public class FetchCurrenciesJob {

    @Autowired
    private FxCurrencyRepository repo;

    @Autowired
    private FetchFxCurrenciesService service;

    @Scheduled(fixedDelay = 86400000)
    private void fetchFxCurrencies() throws ServiceException, RemoteException {
        repo.deleteAll();;
        List<FxCurrency> rates = service.fetchFxCurrencies();
        repo.saveAll(mapToDAO(rates));
    }

    private List<FxCurrencyDAO> mapToDAO(List<FxCurrency> currencies) {
        List<FxCurrencyDAO> fxCurrencyDAOS = new LinkedList<>();
        for (FxCurrency currency: currencies) {
            FxCurrencyDAO dao = new FxCurrencyDAO();
            dao.setCurrencyName(currency.getCurrencyName());
            dao.setCurrencyCode(currency.getCurrencyCode());
            fxCurrencyDAOS.add(dao);
        }
        return fxCurrencyDAOS;
    }
}
