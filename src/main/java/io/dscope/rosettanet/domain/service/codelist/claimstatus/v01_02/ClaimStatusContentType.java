
package io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ClaimStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="OPE"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *     &lt;enumeration value="VOI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClaimStatusContentType")
@XmlEnum
public enum ClaimStatusContentType {

    CAN,
    CLO,
    COM,
    INC,
    OPE,
    UPD,
    VOI;

    public String value() {
        return name();
    }

    public static ClaimStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
