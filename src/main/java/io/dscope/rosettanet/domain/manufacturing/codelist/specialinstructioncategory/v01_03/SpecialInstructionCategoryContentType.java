
package io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialInstructionCategoryContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpecialInstructionCategoryContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialInstructionCategoryContentType")
@XmlEnum
public enum SpecialInstructionCategoryContentType {

    PRO,
    STA;

    public String value() {
        return name();
    }

    public static SpecialInstructionCategoryContentType fromValue(String v) {
        return valueOf(v);
    }

}
