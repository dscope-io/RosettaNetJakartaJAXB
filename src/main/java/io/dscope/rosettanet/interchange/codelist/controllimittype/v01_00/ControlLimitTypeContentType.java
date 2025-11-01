
package io.dscope.rosettanet.interchange.codelist.controllimittype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlLimitTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ControlLimitTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ANA"/&gt;
 *     &lt;enumeration value="CRV"/&gt;
 *     &lt;enumeration value="ENG"/&gt;
 *     &lt;enumeration value="MKS"/&gt;
 *     &lt;enumeration value="PER"/&gt;
 *     &lt;enumeration value="SRN"/&gt;
 *     &lt;enumeration value="TEM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ControlLimitTypeContentType")
@XmlEnum
public enum ControlLimitTypeContentType {

    ANA,
    CRV,
    ENG,
    MKS,
    PER,
    SRN,
    TEM;

    public String value() {
        return name();
    }

    public static ControlLimitTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
