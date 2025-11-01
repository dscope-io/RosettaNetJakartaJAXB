
package io.dscope.rosettanet.domain.salesreporting.codelist.bookpricequalifier.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookPriceQualifierContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BookPriceQualifierContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AVC"/&gt;
 *     &lt;enumeration value="RPC"/&gt;
 *     &lt;enumeration value="LNC"/&gt;
 *     &lt;enumeration value="NTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookPriceQualifierContentType")
@XmlEnum
public enum BookPriceQualifierContentType {

    AVC,
    RPC,
    LNC,
    NTC;

    public String value() {
        return name();
    }

    public static BookPriceQualifierContentType fromValue(String v) {
        return valueOf(v);
    }

}
