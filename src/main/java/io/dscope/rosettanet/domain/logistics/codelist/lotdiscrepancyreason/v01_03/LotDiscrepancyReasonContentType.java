
package io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotDiscrepancyReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LotDiscrepancyReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DLO"/&gt;
 *     &lt;enumeration value="WLO"/&gt;
 *     &lt;enumeration value="WLQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotDiscrepancyReasonContentType")
@XmlEnum
public enum LotDiscrepancyReasonContentType {

    DLO,
    WLO,
    WLQ;

    public String value() {
        return name();
    }

    public static LotDiscrepancyReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
