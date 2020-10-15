package lt.augustas.fxrates.task.controller;

import lt.augustas.fxrates.task.entity.Exchange;
import lt.augustas.fxrates.task.entity.FxCurrency;
import lt.augustas.fxrates.task.entity.FxRate;
import lt.augustas.fxrates.task.service.FxService;
import lt.augustas.fxrates.task.soap.FetchFxRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/fx/")
public class FxController {

    private final FxService fxService;

    private final FetchFxRatesService soapService;

    @Autowired
    public FxController(FxService fxService, FetchFxRatesService soapService) {
        this.fxService = fxService;
        this.soapService = soapService;
    }

    @RequestMapping("/currencies")
    public ResponseEntity<List<FxCurrency>> fetchFxCurrencies() {
        return new ResponseEntity<>(fxService.fetchFxCurrencies(), HttpStatus.OK);
    }

    @RequestMapping("/rates")
    public ResponseEntity<List<FxRate>> fetchFxRates() {
        return new ResponseEntity<>(fxService.fetchFxRates(), HttpStatus.OK);
    }

    @RequestMapping("/rates/{currency-code}/exchange")
    public ResponseEntity<Exchange> fetchFxExchange(@PathVariable("currency-code") String currencyCode, @RequestParam("amount") BigDecimal amount) {
        return new ResponseEntity<>(fxService.calculateFxExchange(currencyCode, amount), HttpStatus.OK);
    }


    @RequestMapping("/rates/{currency-code}")
    public ResponseEntity<List<FxRate>> fetchFxRates(@PathVariable("currency-code") String currencyCode) throws ServiceException, RemoteException {
        return new ResponseEntity<>(soapService.fetchRatesForCurrency(currencyCode), HttpStatus.OK);
    }

}
