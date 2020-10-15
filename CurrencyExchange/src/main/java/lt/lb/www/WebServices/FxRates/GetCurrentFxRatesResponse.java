/**
 * GetCurrentFxRatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class GetCurrentFxRatesResponse  implements java.io.Serializable {
    private lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getCurrentFxRatesResult;

    public GetCurrentFxRatesResponse() {
    }

    public GetCurrentFxRatesResponse(
           lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getCurrentFxRatesResult) {
           this.getCurrentFxRatesResult = getCurrentFxRatesResult;
    }


    /**
     * Gets the getCurrentFxRatesResult value for this GetCurrentFxRatesResponse.
     * 
     * @return getCurrentFxRatesResult
     */
    public lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getGetCurrentFxRatesResult() {
        return getCurrentFxRatesResult;
    }


    /**
     * Sets the getCurrentFxRatesResult value for this GetCurrentFxRatesResponse.
     * 
     * @param getCurrentFxRatesResult
     */
    public void setGetCurrentFxRatesResult(lt.lb.www.WebServices.FxRates.GetCurrentFxRatesResponseGetCurrentFxRatesResult getCurrentFxRatesResult) {
        this.getCurrentFxRatesResult = getCurrentFxRatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentFxRatesResponse)) return false;
        GetCurrentFxRatesResponse other = (GetCurrentFxRatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCurrentFxRatesResult==null && other.getGetCurrentFxRatesResult()==null) || 
             (this.getCurrentFxRatesResult!=null &&
              this.getCurrentFxRatesResult.equals(other.getGetCurrentFxRatesResult())));
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
        if (getGetCurrentFxRatesResult() != null) {
            _hashCode += getGetCurrentFxRatesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentFxRatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getCurrentFxRatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentFxRatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getCurrentFxRatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getCurrentFxRatesResponse>getCurrentFxRatesResult"));
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
