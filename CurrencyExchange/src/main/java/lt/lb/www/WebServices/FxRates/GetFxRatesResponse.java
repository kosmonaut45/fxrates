/**
 * GetFxRatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class GetFxRatesResponse  implements java.io.Serializable {
    private lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getFxRatesResult;

    public GetFxRatesResponse() {
    }

    public GetFxRatesResponse(
           lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getFxRatesResult) {
           this.getFxRatesResult = getFxRatesResult;
    }


    /**
     * Gets the getFxRatesResult value for this GetFxRatesResponse.
     * 
     * @return getFxRatesResult
     */
    public lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getGetFxRatesResult() {
        return getFxRatesResult;
    }


    /**
     * Sets the getFxRatesResult value for this GetFxRatesResponse.
     * 
     * @param getFxRatesResult
     */
    public void setGetFxRatesResult(lt.lb.www.WebServices.FxRates.GetFxRatesResponseGetFxRatesResult getFxRatesResult) {
        this.getFxRatesResult = getFxRatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFxRatesResponse)) return false;
        GetFxRatesResponse other = (GetFxRatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFxRatesResult==null && other.getGetFxRatesResult()==null) || 
             (this.getFxRatesResult!=null &&
              this.getFxRatesResult.equals(other.getGetFxRatesResult())));
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
        if (getGetFxRatesResult() != null) {
            _hashCode += getGetFxRatesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFxRatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFxRatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "getFxRatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">>getFxRatesResponse>getFxRatesResult"));
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
