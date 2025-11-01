
package io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAvailabilityCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductAvailabilityCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FON"/&gt;
 *     &lt;enumeration value="INV"/&gt;
 *     &lt;enumeration value="MPF"/&gt;
 *     &lt;enumeration value="NTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductAvailabilityCodeContentType")
@XmlEnum
public enum ProductAvailabilityCodeContentType {

    FON,
    INV,
    MPF,
    NTF;

    public String value() {
        return name();
    }

    public static ProductAvailabilityCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
