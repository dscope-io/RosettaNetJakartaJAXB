
package io.dscope.rosettanet.domain.manufacturing.codelist.waferpassivation.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaferPassivationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WaferPassivationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WaferPassivationContentType")
@XmlEnum
public enum WaferPassivationContentType {

    SIN;

    public String value() {
        return name();
    }

    public static WaferPassivationContentType fromValue(String v) {
        return valueOf(v);
    }

}
