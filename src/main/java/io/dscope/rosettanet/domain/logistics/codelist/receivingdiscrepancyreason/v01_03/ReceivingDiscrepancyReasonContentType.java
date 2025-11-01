
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancyreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceivingDiscrepancyReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReceivingDiscrepancyReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BST"/&gt;
 *     &lt;enumeration value="DAM"/&gt;
 *     &lt;enumeration value="DOR"/&gt;
 *     &lt;enumeration value="ILA"/&gt;
 *     &lt;enumeration value="INM"/&gt;
 *     &lt;enumeration value="NPO"/&gt;
 *     &lt;enumeration value="NPS"/&gt;
 *     &lt;enumeration value="OVE"/&gt;
 *     &lt;enumeration value="PLD"/&gt;
 *     &lt;enumeration value="SHO"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *     &lt;enumeration value="WPA"/&gt;
 *     &lt;enumeration value="WPO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReceivingDiscrepancyReasonContentType")
@XmlEnum
public enum ReceivingDiscrepancyReasonContentType {

    BST,
    DAM,
    DOR,
    ILA,
    INM,
    NPO,
    NPS,
    OVE,
    PLD,
    SHO,
    WIT,
    WPA,
    WPO;

    public String value() {
        return name();
    }

    public static ReceivingDiscrepancyReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
