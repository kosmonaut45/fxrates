/**
 * GetFxRatesForCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class GetFxRatesForCurrency  implements java.io.Serializable {
    private java.lang.String tp;

    private java.lang.String ccy;

    private java.lang.String dtFrom;

    private java.lang.String dtTo;

    public GetFxRatesForCurrency() {
    }

    public GetFxRatesForCurrency(
           java.lang.String tp,
           java.lang.String ccy,
           java.lang.String dtFrom,
           java.lang.String dtTo) {
           this.tp = tp;
           this.ccy = ccy;
           this.dtFrom = dtFrom;
           this.dtTo = dtTo;
    }


    /**
     * Gets the tp value for this GetFxRatesForCurrency.
     * 
     * @return tp
     */
    public java.lang.String getTp() {
        return tp;
    }


    /**
     * Sets the tp value for this GetFxRatesForCurrency.
     * 
     * @param tp
     */
    public void setTp(java.lang.String tp) {
        this.tp = tp;
    }


    /**
     * Gets the ccy value for this GetFxRatesForCurrency.
     * 
     * @return ccy
     */
    public java.lang.String getCcy() {
        return ccy;
    }


    /**
     * Sets the ccy value for this GetFxRatesForCurrency.
     * 
     * @param ccy
     */
    public void setCcy(java.lang.String ccy) {
        this.ccy = ccy;
    }


    /**
     * Gets the dtFrom value for this GetFxRatesForCurrency.
     * 
     * @return dtFrom
     */
    public java.lang.String getDtFrom() {
        return dtFrom;
    }


    /**
     * Sets the dtFrom value for this GetFxRatesForCurrency.
     * 
     * @param dtFrom
     */
    public void setDtFrom(java.lang.String dtFrom) {
        this.dtFrom = dtFrom;
    }


    /**
     * Gets the dtTo value for this GetFxRatesForCurrency.
     * 
     * @return dtTo
     */
    public java.lang.String getDtTo() {
        return dtTo;
    }


    /**
     * Sets the dtTo value for this GetFxRatesForCurrency.
     * 
     * @param dtTo
     */
    public void setDtTo(java.lang.String dtTo) {
        this.dtTo = dtTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFxRatesForCurrency)) return false;
        GetFxRatesForCurrency other = (GetFxRatesForCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tp==null && other.getTp()==null) || 
             (this.tp!=null &&
              this.tp.equals(other.getTp()))) &&
            ((this.ccy==null && other.getCcy()==null) || 
             (this.ccy!=null &&
              this.ccy.equals(other.getCcy()))) &&
            ((this.dtFrom==null && other.getDtFrom()==null) || 
             (this.dtFrom!=null &&
              this.dtFrom.equals(other.getDtFrom()))) &&
            ((this.dtTo==null && other.getDtTo()==null) || 
             (this.dtTo!=null &&
              this.dtTo.equals(other.getDtTo())));
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
        if (getTp() != null) {
            _hashCode += getTp().hashCode();
        }
        if (getCcy() != null) {
            _hashCode += getCcy().hashCode();
        }
        if (getDtFrom() != null) {
            _hashCode += getDtFrom().hashCode();
        }
        if (getDtTo() != null) {
            _hashCode += getDtTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFxRatesForCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRatesForCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "tp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "ccy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "dtFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "dtTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
