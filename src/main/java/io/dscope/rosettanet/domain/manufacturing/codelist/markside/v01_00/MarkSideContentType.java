
package io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkSideContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MarkSideContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BOT"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="HEA"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarkSideContentType")
@XmlEnum
public enum MarkSideContentType {

    BOT,
    COM,
    HEA,
    TOP;

    public String value() {
        return name();
    }

    public static MarkSideContentType fromValue(String v) {
        return valueOf(v);
    }

}
