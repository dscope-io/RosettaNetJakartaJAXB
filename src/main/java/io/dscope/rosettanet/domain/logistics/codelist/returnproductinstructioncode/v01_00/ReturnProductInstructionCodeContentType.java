
package io.dscope.rosettanet.domain.logistics.codelist.returnproductinstructioncode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnProductInstructionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnProductInstructionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NCA"/&gt;
 *     &lt;enumeration value="NCN"/&gt;
 *     &lt;enumeration value="NRE"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="SAL"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnProductInstructionCodeContentType")
@XmlEnum
public enum ReturnProductInstructionCodeContentType {

    NCA,
    NCN,
    NRE,
    NON,
    NAV,
    RET,
    SAL,
    SCR;

    public String value() {
        return name();
    }

    public static ReturnProductInstructionCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
