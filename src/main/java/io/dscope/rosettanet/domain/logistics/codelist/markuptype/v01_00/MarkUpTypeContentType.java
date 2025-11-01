
package io.dscope.rosettanet.domain.logistics.codelist.markuptype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkUpTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MarkUpTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="NCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarkUpTypeContentType")
@XmlEnum
public enum MarkUpTypeContentType {

    @XmlEnumValue("Add")
    ADD("Add"),
    DEL("DEL"),
    MOD("MOD"),
    NCH("NCH");
    private final String value;

    MarkUpTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkUpTypeContentType fromValue(String v) {
        for (MarkUpTypeContentType c: MarkUpTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
