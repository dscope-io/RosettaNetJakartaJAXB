
package io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureModifierContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FailureModifierContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="DAM"/&gt;
 *     &lt;enumeration value="ENV"/&gt;
 *     &lt;enumeration value="FAW"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="NAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureModifierContentType")
@XmlEnum
public enum FailureModifierContentType {

    CON,
    COO,
    DAM,
    ENV,
    FAW,
    INT,
    NAP;

    public String value() {
        return name();
    }

    public static FailureModifierContentType fromValue(String v) {
        return valueOf(v);
    }

}
