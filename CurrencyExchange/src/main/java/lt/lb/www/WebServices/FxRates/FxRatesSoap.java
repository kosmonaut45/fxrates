/**
 * FxRatesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public interface FxRatesSoap extends java.rmi.Remote {

    /**
     * List of ISO 4217 currencies
     */
    public lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult getCurrencyList() throws java.rmi.RemoteException;

    /**
     * Last available currency exchange rates
     */
    public lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getCurrentFxRates(java.lang.String tp) throws java.rmi.RemoteException;

    /**
     * Currency exchange rates at specified date
     */
    public lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getFxRates(java.lang.String tp, java.lang.String dt) throws java.rmi.RemoteException;

    /**
     * Exchange rates for specified currency at date interval
     */
    public lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getFxRatesForCurrency(java.lang.String tp, java.lang.String ccy, java.lang.String dtFrom, java.lang.String dtTo) throws java.rmi.RemoteException;
}
