
package io.dscope.rosettanet.universal.codelist.taxtype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaxTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FET"/&gt;
 *     &lt;enumeration value="STT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeContentType")
@XmlEnum
public enum TaxTypeContentType {

    FET,
    STT;

    public String value() {
        return name();
    }

    public static TaxTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
