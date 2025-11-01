
package io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContainerTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BOX"/&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="PLT"/&gt;
 *     &lt;enumeration value="ENV"/&gt;
 *     &lt;enumeration value="DCB"/&gt;
 *     &lt;enumeration value="ITM"/&gt;
 *     &lt;enumeration value="OTP"/&gt;
 *     &lt;enumeration value="RFG"/&gt;
 *     &lt;enumeration value="TNK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContainerTypeContentType")
@XmlEnum
public enum ContainerTypeContentType {

    BOX,
    CRT,
    PLT,
    ENV,
    DCB,
    ITM,
    OTP,
    RFG,
    TNK;

    public String value() {
        return name();
    }

    public static ContainerTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
