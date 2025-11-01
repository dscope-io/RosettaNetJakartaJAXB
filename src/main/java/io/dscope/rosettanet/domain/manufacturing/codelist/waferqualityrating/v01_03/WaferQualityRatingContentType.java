
package io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_03;

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
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="SBT"/&gt;
 *     &lt;enumeration value="SLW"/&gt;
 *     &lt;enumeration value="TIA"/&gt;
 *     &lt;enumeration value="TIB"/&gt;
 *     &lt;enumeration value="WDI"/&gt;
 *     &lt;enumeration value="WDO"/&gt;
 *     &lt;enumeration value="WQD"/&gt;
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
    LOW,
    SBT,
    SLW,
    TIA,
    TIB,
    WDI,
    WDO,
    WQD;

    public String value() {
        return name();
    }

    public static WaferQualityRatingContentType fromValue(String v) {
        return valueOf(v);
    }

}
