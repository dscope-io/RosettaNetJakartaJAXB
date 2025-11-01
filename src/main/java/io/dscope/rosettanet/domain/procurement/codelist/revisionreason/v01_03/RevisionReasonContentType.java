
package io.dscope.rosettanet.domain.procurement.codelist.revisionreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevisionReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RevisionReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ALI"/&gt;
 *     &lt;enumeration value="CAP"/&gt;
 *     &lt;enumeration value="DII"/&gt;
 *     &lt;enumeration value="DIP"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="IPC"/&gt;
 *     &lt;enumeration value="MIE"/&gt;
 *     &lt;enumeration value="NEL"/&gt;
 *     &lt;enumeration value="NEP"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="OCO"/&gt;
 *     &lt;enumeration value="OPC"/&gt;
 *     &lt;enumeration value="PCH"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RPL"/&gt;
 *     &lt;enumeration value="RPR"/&gt;
 *     &lt;enumeration value="STC"/&gt;
 *     &lt;enumeration value="TRI"/&gt;
 *     &lt;enumeration value="WRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RevisionReasonContentType")
@XmlEnum
public enum RevisionReasonContentType {

    ALI,
    CAP,
    DII,
    DIP,
    EXP,
    FOB,
    IPC,
    MIE,
    NEL,
    NEP,
    NPR,
    OCO,
    OPC,
    PCH,
    PRC,
    PRI,
    REP,
    RPL,
    RPR,
    STC,
    TRI,
    WRE;

    public String value() {
        return name();
    }

    public static RevisionReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
