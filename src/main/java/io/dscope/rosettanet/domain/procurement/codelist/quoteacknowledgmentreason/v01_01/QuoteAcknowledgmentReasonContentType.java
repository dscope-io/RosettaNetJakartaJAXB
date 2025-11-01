
package io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteAcknowledgmentReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuoteAcknowledgmentReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="IPR"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="ISN"/&gt;
 *     &lt;enumeration value="DSN"/&gt;
 *     &lt;enumeration value="ISV"/&gt;
 *     &lt;enumeration value="IDT"/&gt;
 *     &lt;enumeration value="ICN"/&gt;
 *     &lt;enumeration value="ICO"/&gt;
 *     &lt;enumeration value="IBL"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="IQN"/&gt;
 *     &lt;enumeration value="IPC"/&gt;
 *     &lt;enumeration value="IQT"/&gt;
 *     &lt;enumeration value="ISA"/&gt;
 *     &lt;enumeration value="ICW"/&gt;
 *     &lt;enumeration value="IPL"/&gt;
 *     &lt;enumeration value="OTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteAcknowledgmentReasonContentType")
@XmlEnum
public enum QuoteAcknowledgmentReasonContentType {

    IPR,
    ISL,
    ISN,
    DSN,
    ISV,
    IDT,
    ICN,
    ICO,
    IBL,
    IPO,
    IQN,
    IPC,
    IQT,
    ISA,
    ICW,
    IPL,
    OTR;

    public String value() {
        return name();
    }

    public static QuoteAcknowledgmentReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
