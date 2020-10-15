/**
 * GetFxRates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.www.WebServices.FxRates;

public class GetFxRates  implements java.io.Serializable {
    private java.lang.String tp;

    private java.lang.String dt;

    public GetFxRates() {
    }

    public GetFxRates(
           java.lang.String tp,
           java.lang.String dt) {
           this.tp = tp;
           this.dt = dt;
    }


    /**
     * Gets the tp value for this GetFxRates.
     * 
     * @return tp
     */
    public java.lang.String getTp() {
        return tp;
    }


    /**
     * Sets the tp value for this GetFxRates.
     * 
     * @param tp
     */
    public void setTp(java.lang.String tp) {
        this.tp = tp;
    }


    /**
     * Gets the dt value for this GetFxRates.
     * 
     * @return dt
     */
    public java.lang.String getDt() {
        return dt;
    }


    /**
     * Sets the dt value for this GetFxRates.
     * 
     * @param dt
     */
    public void setDt(java.lang.String dt) {
        this.dt = dt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFxRates)) return false;
        GetFxRates other = (GetFxRates) obj;
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
            ((this.dt==null && other.getDt()==null) || 
             (this.dt!=null &&
              this.dt.equals(other.getDt())));
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
        if (getDt() != null) {
            _hashCode += getDt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFxRates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", ">getFxRates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "tp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lb.lt/WebServices/FxRates", "dt"));
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
