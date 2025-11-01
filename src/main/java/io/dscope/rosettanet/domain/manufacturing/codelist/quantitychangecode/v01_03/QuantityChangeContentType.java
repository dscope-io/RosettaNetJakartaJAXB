
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityChangeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuantityChangeContentType"&gt;
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
@XmlType(name = "QuantityChangeContentType")
@XmlEnum
public enum QuantityChangeContentType {

    BON,
    CQU,
    REJ,
    SCR;

    public String value() {
        return name();
    }

    public static QuantityChangeContentType fromValue(String v) {
        return valueOf(v);
    }

}
