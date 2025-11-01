
package io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaferQualityRatingContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WaferQualityRatingContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AVG"/&gt;
 *     &lt;enumeration value="BES"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SBT"/&gt;
 *     &lt;enumeration value="SLW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WaferQualityRatingContentType")
@XmlEnum
public enum WaferQualityRatingContentType {

    AVG,
    BES,
    D,
    G,
    K,
    LOW,
    P,
    S,
    SBT,
    SLW;

    public String value() {
        return name();
    }

    public static WaferQualityRatingContentType fromValue(String v) {
        return valueOf(v);
    }

}
