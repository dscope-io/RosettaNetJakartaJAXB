
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityChangeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuantityChangeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BON"/&gt;
 *     &lt;enumeration value="CQU"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuantityChangeCodeContentType")
@XmlEnum
public enum QuantityChangeCodeContentType {

    BON,
    CQU,
    REJ,
    SCR;

    public String value() {
        return name();
    }

    public static QuantityChangeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
