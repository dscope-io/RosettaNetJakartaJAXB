
package io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomsTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomsTypeContentType")
@XmlEnum
public enum CustomsTypeContentType {

    IMP,
    EXP;

    public String value() {
        return name();
    }

    public static CustomsTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
