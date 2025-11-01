
package io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepairTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RepairTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="SRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepairTypeContentType")
@XmlEnum
public enum RepairTypeContentType {

    PRE,
    SRE;

    public String value() {
        return name();
    }

    public static RepairTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
