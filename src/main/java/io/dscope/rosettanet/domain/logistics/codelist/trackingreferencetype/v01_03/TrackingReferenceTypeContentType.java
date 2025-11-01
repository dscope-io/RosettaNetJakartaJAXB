
package io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingReferenceTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingReferenceTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BKN"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="CRN"/&gt;
 *     &lt;enumeration value="HAN"/&gt;
 *     &lt;enumeration value="MAB"/&gt;
 *     &lt;enumeration value="OBL"/&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="SON"/&gt;
 *     &lt;enumeration value="SID"/&gt;
 *     &lt;enumeration value="SRN"/&gt;
 *     &lt;enumeration value="TRN"/&gt;
 *     &lt;enumeration value="RFI"/&gt;
 *     &lt;enumeration value="RRN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingReferenceTypeContentType")
@XmlEnum
public enum TrackingReferenceTypeContentType {

    BOL,
    BKN,
    CIN,
    CRN,
    HAN,
    MAB,
    OBL,
    PSN,
    PRO,
    SON,
    SID,
    SRN,
    TRN,
    RFI,
    RRN;

    public String value() {
        return name();
    }

    public static TrackingReferenceTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
