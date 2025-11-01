
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceivingDiscrepancyContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReceivingDiscrepancyContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OHO"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReceivingDiscrepancyContentType")
@XmlEnum
public enum ReceivingDiscrepancyContentType {

    OHO,
    REJ;

    public String value() {
        return name();
    }

    public static ReceivingDiscrepancyContentType fromValue(String v) {
        return valueOf(v);
    }

}
