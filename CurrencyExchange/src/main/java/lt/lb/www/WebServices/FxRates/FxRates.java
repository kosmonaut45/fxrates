/**
 * FxRates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public interface FxRates extends javax.xml.rpc.Service {

/**
 * Web Service provides exchange rates of the euro against foreign
 * currencies, published by the European Central Bank and the Bank of
 * Lithuania.
 */
    public java.lang.String getFxRatesSoapAddress();

    public lt.lb.www.WebServices.FxRates.FxRatesSoap getFxRatesSoap() throws javax.xml.rpc.ServiceException;

    public lt.lb.www.WebServices.FxRates.FxRatesSoap getFxRatesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
