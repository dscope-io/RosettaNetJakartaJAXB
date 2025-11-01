
package io.dscope.rosettanet.domain.manufacturing.codelist.componenttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ComponentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAG"/&gt;
 *     &lt;enumeration value="CHP"/&gt;
 *     &lt;enumeration value="CRD"/&gt;
 *     &lt;enumeration value="FRM"/&gt;
 *     &lt;enumeration value="MCM"/&gt;
 *     &lt;enumeration value="SCM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComponentTypeContentType")
@XmlEnum
public enum ComponentTypeContentType {

    CAG,
    CHP,
    CRD,
    FRM,
    MCM,
    SCM;

    public String value() {
        return name();
    }

    public static ComponentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
