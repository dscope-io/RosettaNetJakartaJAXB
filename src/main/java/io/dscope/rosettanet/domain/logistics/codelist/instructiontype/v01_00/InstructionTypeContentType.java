
package io.dscope.rosettanet.domain.logistics.codelist.instructiontype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstructionTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="REA"/&gt;
 *     &lt;enumeration value="SCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstructionTypeContentType")
@XmlEnum
public enum InstructionTypeContentType {

    REA,
    SCA;

    public String value() {
        return name();
    }

    public static InstructionTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
