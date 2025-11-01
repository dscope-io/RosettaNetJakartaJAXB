
package io.dscope.rosettanet.interchange.codelist.rejectionreason.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RejectionReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADA"/&gt;
 *     &lt;enumeration value="AQE"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CAU"/&gt;
 *     &lt;enumeration value="CCI"/&gt;
 *     &lt;enumeration value="CIC"/&gt;
 *     &lt;enumeration value="CPX"/&gt;
 *     &lt;enumeration value="DUS"/&gt;
 *     &lt;enumeration value="INU"/&gt;
 *     &lt;enumeration value="IPN"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="NBD"/&gt;
 *     &lt;enumeration value="NBO"/&gt;
 *     &lt;enumeration value="NLC"/&gt;
 *     &lt;enumeration value="NOS"/&gt;
 *     &lt;enumeration value="NPO"/&gt;
 *     &lt;enumeration value="NUM"/&gt;
 *     &lt;enumeration value="RPH"/&gt;
 *     &lt;enumeration value="RPL"/&gt;
 *     &lt;enumeration value="RPN"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="ZRB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReasonContentType")
@XmlEnum
public enum RejectionReasonContentType {

    ADA,
    AQE,
    CAD,
    CAU,
    CCI,
    CIC,
    CPX,
    DUS,
    INU,
    IPN,
    ISL,
    NBD,
    NBO,
    NLC,
    NOS,
    NPO,
    NUM,
    RPH,
    RPL,
    RPN,
    SDN,
    SDP,
    ZRB;

    public String value() {
        return name();
    }

    public static RejectionReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
