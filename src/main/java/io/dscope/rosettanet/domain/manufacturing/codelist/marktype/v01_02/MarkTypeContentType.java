
package io.dscope.rosettanet.domain.manufacturing.codelist.marktype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MarkTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="INK"/&gt;
 *     &lt;enumeration value="LAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarkTypeContentType")
@XmlEnum
public enum MarkTypeContentType {

    INK,
    LAS;

    public String value() {
        return name();
    }

    public static MarkTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
