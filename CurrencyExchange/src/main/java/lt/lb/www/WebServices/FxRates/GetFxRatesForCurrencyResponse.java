/**
 * GetFxRatesForCurrencyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class GetFxRatesForCurrencyResponse  implements java.io.Serializable {
    private lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getFxRatesForCurrencyResult;

    public GetFxRatesForCurrencyResponse() {
    }

    public GetFxRatesForCurrencyResponse(
           lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getFxRatesForCurrencyResult) {
           this.getFxRatesForCurrencyResult = getFxRatesForCurrencyResult;
    }


    /**
     * Gets the getFxRatesForCurrencyResult value for this GetFxRatesForCurrencyResponse.
     * 
     * @return getFxRatesForCurrencyResult
     */
    public lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getGetFxRatesForCurrencyResult() {
        return getFxRatesForCurrencyResult;
    }


    /**
     * Sets the getFxRatesForCurrencyResult value for this GetFxRatesForCurrencyResponse.
     * 
     * @param getFxRatesForCurrencyResult
     */
    public void setGetFxRatesForCurrencyResult(lt.lb.www.WebServices.FxRates.GetFxRatesForCurrencyResponseGetFxRatesForCurrencyResult getFxRatesForCurrencyResult) {
        this.getFxRatesForCurrencyResult = getFxRatesForCurrencyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFxRatesForCurrencyResponse)) return false;
        GetFxRatesForCurrencyResponse other = (GetFxRatesForCurrencyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFxRatesForCurrencyResult==null && other.getGetFxRatesForCurrencyResult()==null) || 
             (this.getFxRatesForCurrencyResult!=null &&
              this.getFxRatesForCurrencyResult.equals(other.getGetFxRatesForCurrencyResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetFxRatesForCurrencyResult() != null) {
            _hashCode += getGetFxRatesForCurrencyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFxRatesForCurrencyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRatesForCurrencyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFxRatesForCurrencyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getFxRatesForCurrencyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getFxRatesForCurrencyResponse>getFxRatesForCurrencyResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
