
package io.dscope.rosettanet.domain.service.codelist.returnproductinstruction.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnProductInstructionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnProductInstructionContentType"&gt;
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
@XmlType(name = "ReturnProductInstructionContentType")
@XmlEnum
public enum ReturnProductInstructionContentType {

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

    public static ReturnProductInstructionContentType fromValue(String v) {
        return valueOf(v);
    }

}
