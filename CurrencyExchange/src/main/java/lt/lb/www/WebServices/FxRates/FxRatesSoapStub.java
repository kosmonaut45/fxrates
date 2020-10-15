/**
 * FxRatesSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class FxRatesSoapStub extends org.apache.axis.client.Stub implements lt.lb.www.WebServices.FxRates.FxRatesSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrencyList");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getCurrencyListResponse>getCurrencyListResult"));
        oper.setReturnClass(lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getCurrencyListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentFxRates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "tp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getCurrentFxRatesResponse>getCurrentFxRatesResult"));
        oper.setReturnClass(lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getCurrentFxRatesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFxRates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "tp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "dt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getFxRatesResponse>getFxRatesResult"));
        oper.setReturnClass(lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getFxRatesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFxRatesForCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "tp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "ccy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "dtFrom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "dtTo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getFxRatesForCurrencyResponse>getFxRatesForCurrencyResult"));
        oper.setReturnClass(lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getFxRatesForCurrencyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public FxRatesSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FxRatesSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FxRatesSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getCurrencyListResponse>getCurrencyListResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getCurrentFxRatesResponse>getCurrentFxRatesResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getFxRatesForCurrencyResponse>getFxRatesForCurrencyResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getFxRatesResponse>getFxRatesResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getCurrentFxRates");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetCurrentFxRates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getCurrentFxRatesResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRates");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetFxRates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRatesForCurrency");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetFxRatesForCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRatesForCurrencyResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRatesResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.www.WebServices.FxRates.GetFxRatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult getCurrencyList() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.lb.lt/WebServices/FxRates/getCurrencyList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getCurrencyList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.www.WebServices.FxRates.GetCurrencyListResponseGetCurrencyListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getCurrentFxRates(java.lang.String tp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.lb.lt/WebServices/FxRates/getCurrentFxRates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getCurrentFxRates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getFxRates(java.lang.String tp, java.lang.String dt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.lb.lt/WebServices/FxRates/getFxRates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getFxRates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tp, dt});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getFxRatesForCurrency(java.lang.String tp, java.lang.String ccy, java.lang.String dtFrom, java.lang.String dtTo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.lb.lt/WebServices/FxRates/getFxRatesForCurrency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getFxRatesForCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tp, ccy, dtFrom, dtTo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
