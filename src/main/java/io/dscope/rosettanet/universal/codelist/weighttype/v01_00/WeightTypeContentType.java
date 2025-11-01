
package io.dscope.rosettanet.universal.codelist.weighttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeightTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="GRS"/&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="CHR"/&gt;
 *     &lt;enumeration value="GNR"/&gt;
 *     &lt;enumeration value="DMN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightTypeContentType")
@XmlEnum
public enum WeightTypeContentType {

    GRS,
    NET,
    CHR,
    GNR,
    DMN;

    public String value() {
        return name();
    }

    public static WeightTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
