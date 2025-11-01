
package io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnLabelCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnLabelCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="D-N"/&gt;
 *     &lt;enumeration value="UNU"/&gt;
 *     &lt;enumeration value="U-N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnLabelCodeContentType")
@XmlEnum
public enum ReturnLabelCodeContentType {

    DEF("DEF"),
    @XmlEnumValue("D-N")
    D_N("D-N"),
    UNU("UNU"),
    @XmlEnumValue("U-N")
    U_N("U-N");
    private final String value;

    ReturnLabelCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnLabelCodeContentType fromValue(String v) {
        for (ReturnLabelCodeContentType c: ReturnLabelCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
