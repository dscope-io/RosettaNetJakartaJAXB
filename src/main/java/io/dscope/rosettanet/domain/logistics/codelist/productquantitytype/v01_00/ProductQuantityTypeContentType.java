
package io.dscope.rosettanet.domain.logistics.codelist.productquantitytype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductQuantityTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductQuantityTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ANE"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PSE"/&gt;
 *     &lt;enumeration value="SHR"/&gt;
 *     &lt;enumeration value="UPA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductQuantityTypeContentType")
@XmlEnum
public enum ProductQuantityTypeContentType {

    ANE,
    PAS,
    PSE,
    SHR,
    UPA;

    public String value() {
        return name();
    }

    public static ProductQuantityTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
