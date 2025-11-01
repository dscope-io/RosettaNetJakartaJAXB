
package io.dscope.rosettanet.domain.procurement.codelist.creditcardclassification.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreditCardClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AMX"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="EUC"/&gt;
 *     &lt;enumeration value="JCU"/&gt;
 *     &lt;enumeration value="MAC"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="VIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardClassificationContentType")
@XmlEnum
public enum CreditCardClassificationContentType {

    AMX,
    DIS,
    EUC,
    JCU,
    MAC,
    PRO,
    VIS;

    public String value() {
        return name();
    }

    public static CreditCardClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
