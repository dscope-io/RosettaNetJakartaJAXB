
package io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentRepairContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ComponentRepairContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComponentRepairContentType")
@XmlEnum
public enum ComponentRepairContentType {

    REP,
    REQ,
    UPD;

    public String value() {
        return name();
    }

    public static ComponentRepairContentType fromValue(String v) {
        return valueOf(v);
    }

}
