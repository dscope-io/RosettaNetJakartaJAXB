
package io.dscope.rosettanet.domain.design.codelist.assemblylevelcode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssemblyLevelCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AssemblyLevelCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="PHA"/&gt;
 *     &lt;enumeration value="SAS"/&gt;
 *     &lt;enumeration value="TLA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssemblyLevelCodeContentType")
@XmlEnum
public enum AssemblyLevelCodeContentType {

    COM,
    PHA,
    SAS,
    TLA;

    public String value() {
        return name();
    }

    public static AssemblyLevelCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
