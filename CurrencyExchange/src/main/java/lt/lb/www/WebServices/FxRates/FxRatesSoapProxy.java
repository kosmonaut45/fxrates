package lt.lb.www.WebServices.FxRates;

public class FxRatesSoapProxy implements lt.lb.www.WebServices.FxRates.FxRatesSoap {
  private String _endpoint = null;
  private lt.lb.www.WebServices.FxRates.FxRatesSoap fxRatesSoap = null;
  
  public FxRatesSoapProxy() {
    _initFxRatesSoapProxy();
  }
  
  public FxRatesSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFxRatesSoapProxy();
  }
  
  private void _initFxRatesSoapProxy() {
    try {
      fxRatesSoap = (new lt.lb.www.WebServices.FxRates.FxRatesLocator()).getFxRatesSoap();
      if (fxRatesSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fxRatesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fxRatesSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fxRatesSoap != null)
      ((javax.xml.rpc.Stub)fxRatesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public lt.lb.www.WebServices.FxRates.FxRatesSoap getFxRatesSoap() {
    if (fxRatesSoap == null)
      _initFxRatesSoapProxy();
    return fxRatesSoap;
  }
  
  public lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult getCurrencyList() throws java.rmi.RemoteException{
    if (fxRatesSoap == null)
      _initFxRatesSoapProxy();
    return fxRatesSoap.getCurrencyList();
  }
  
  public lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getCurrentFxRates(java.lang.String tp) throws java.rmi.RemoteException{
    if (fxRatesSoap == null)
      _initFxRatesSoapProxy();
    return fxRatesSoap.getCurrentFxRates(tp);
  }
  
  public lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getFxRates(java.lang.String tp, java.lang.String dt) throws java.rmi.RemoteException{
    if (fxRatesSoap == null)
      _initFxRatesSoapProxy();
    return fxRatesSoap.getFxRates(tp, dt);
  }
  
  public lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getFxRatesForCurrency(java.lang.String tp, java.lang.String ccy, java.lang.String dtFrom, java.lang.String dtTo) throws java.rmi.RemoteException{
    if (fxRatesSoap == null)
      _initFxRatesSoapProxy();
    return fxRatesSoap.getFxRatesForCurrency(tp, ccy, dtFrom, dtTo);
  }
  
  
}