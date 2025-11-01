
package io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccountClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CHK"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="SAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountClassificationContentType")
@XmlEnum
public enum AccountClassificationContentType {

    CHK,
    CRC,
    SAV;

    public String value() {
        return name();
    }

    public static AccountClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
