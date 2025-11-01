
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocessparttype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkInProcessPartTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WorkInProcessPartTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CNU"/&gt;
 *     &lt;enumeration value="DPN"/&gt;
 *     &lt;enumeration value="EIT"/&gt;
 *     &lt;enumeration value="PNU"/&gt;
 *     &lt;enumeration value="PEI"/&gt;
 *     &lt;enumeration value="WPN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkInProcessPartTypeContentType")
@XmlEnum
public enum WorkInProcessPartTypeContentType {

    CNU,
    DPN,
    EIT,
    PNU,
    PEI,
    WPN;

    public String value() {
        return name();
    }

    public static WorkInProcessPartTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
