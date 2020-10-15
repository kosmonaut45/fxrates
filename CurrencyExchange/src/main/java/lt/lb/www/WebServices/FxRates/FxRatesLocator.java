/**
 * FxRatesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class FxRatesLocator extends org.apache.axis.client.Service implements lt.lb.www.WebServices.FxRates.FxRates {

/**
 * Web Service provides exchange rates of the euro against foreign
 * currencies, published by the European Central Bank and the Bank of
 * Lithuania.
 */

    public FxRatesLocator() {
    }


    public FxRatesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FxRatesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FxRatesSoap
    private java.lang.String FxRatesSoap_address = "http://www.lb.lt/webservices/fxrates/fxrates.asmx";

    public java.lang.String getFxRatesSoapAddress() {
        return FxRatesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FxRatesSoapWSDDServiceName = "FxRatesSoap";

    public java.lang.String getFxRatesSoapWSDDServiceName() {
        return FxRatesSoapWSDDServiceName;
    }

    public void setFxRatesSoapWSDDServiceName(java.lang.String name) {
        FxRatesSoapWSDDServiceName = name;
    }

    public lt.lb.www.WebServices.FxRates.FxRatesSoap getFxRatesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FxRatesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFxRatesSoap(endpoint);
    }

    public lt.lb.www.WebServices.FxRates.FxRatesSoap getFxRatesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lt.lb.www.WebServices.FxRates.FxRatesSoapStub _stub = new lt.lb.www.WebServices.FxRates.FxRatesSoapStub(portAddress, this);
            _stub.setPortName(getFxRatesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFxRatesSoapEndpointAddress(java.lang.String address) {
        FxRatesSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (lt.lb.www.WebServices.FxRates.FxRatesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                lt.lb.www.WebServices.FxRates.FxRatesSoapStub _stub = new lt.lb.www.WebServices.FxRates.FxRatesSoapStub(new java.net.URL(FxRatesSoap_address), this);
                _stub.setPortName(getFxRatesSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FxRatesSoap".equals(inputPortName)) {
            return getFxRatesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "FxRates");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "FxRatesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FxRatesSoap".equals(portName)) {
            setFxRatesSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
