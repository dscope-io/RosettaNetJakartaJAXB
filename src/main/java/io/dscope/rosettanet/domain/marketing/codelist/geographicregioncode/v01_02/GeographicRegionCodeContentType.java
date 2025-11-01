
package io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicRegionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GeographicRegionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="GLO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeographicRegionCodeContentType")
@XmlEnum
public enum GeographicRegionCodeContentType {

    GLO;

    public String value() {
        return name();
    }

    public static GeographicRegionCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
