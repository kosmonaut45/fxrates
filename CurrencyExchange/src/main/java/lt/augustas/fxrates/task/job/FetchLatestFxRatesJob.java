package lt.augustas.fxrates.task.job;

import lt.augustas.fxrates.task.entity.FxRate;
import lt.augustas.fxrates.task.entity.database.FxRateDAO;
import lt.augustas.fxrates.task.repository.FxRateRepository;
import lt.augustas.fxrates.task.soap.FetchFxRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

@Component
public class FetchLatestFxRatesJob {

    @Autowired
    private FxRateRepository repo;

    @Autowired
    private FetchFxRatesService service;

    @Scheduled(fixedDelay = 86400000)
    private void testSchedule() throws ServiceException, RemoteException {
        repo.deleteAll();;
        List<FxRate> rates = service.fetchLatestFxRates();
        repo.saveAll(mapToDAO(rates));
    }

    private List<FxRateDAO> mapToDAO(List<FxRate> rates) {
        List<FxRateDAO> ratesDAO = new LinkedList<>();
        for (FxRate rate: rates) {
            FxRateDAO dao = new FxRateDAO();
            dao.setExchangeCurrency(rate.getExchangeCurrency());
            dao.setExchangeValue(rate.getExchangeValue());
            dao.setDate(rate.getDate());
            dao.setCurrency(rate.getCurrency());
            ratesDAO.add(dao);
        }
        return ratesDAO;
    }
}
