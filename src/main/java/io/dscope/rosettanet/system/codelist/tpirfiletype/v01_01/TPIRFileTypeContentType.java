
package io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPIRFileTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TPIRFileTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="XDP"/&gt;
 *     &lt;enumeration value="XML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TPIRFileTypeContentType")
@XmlEnum
public enum TPIRFileTypeContentType {

    PDF,
    XDP,
    XML;

    public String value() {
        return name();
    }

    public static TPIRFileTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
