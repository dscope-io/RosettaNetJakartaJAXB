
package io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChangeReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AID"/&gt;
 *     &lt;enumeration value="BDD"/&gt;
 *     &lt;enumeration value="BWA"/&gt;
 *     &lt;enumeration value="CCH"/&gt;
 *     &lt;enumeration value="CCO"/&gt;
 *     &lt;enumeration value="CHR"/&gt;
 *     &lt;enumeration value="CIC"/&gt;
 *     &lt;enumeration value="DMN"/&gt;
 *     &lt;enumeration value="DPW"/&gt;
 *     &lt;enumeration value="DQP"/&gt;
 *     &lt;enumeration value="ESC"/&gt;
 *     &lt;enumeration value="ETO"/&gt;
 *     &lt;enumeration value="ICW"/&gt;
 *     &lt;enumeration value="IPI"/&gt;
 *     &lt;enumeration value="LTV"/&gt;
 *     &lt;enumeration value="LYI"/&gt;
 *     &lt;enumeration value="MDI"/&gt;
 *     &lt;enumeration value="MSD"/&gt;
 *     &lt;enumeration value="NAI"/&gt;
 *     &lt;enumeration value="NBD"/&gt;
 *     &lt;enumeration value="NBS"/&gt;
 *     &lt;enumeration value="NCL"/&gt;
 *     &lt;enumeration value="NGW"/&gt;
 *     &lt;enumeration value="NMA"/&gt;
 *     &lt;enumeration value="NMS"/&gt;
 *     &lt;enumeration value="NRE"/&gt;
 *     &lt;enumeration value="PIC"/&gt;
 *     &lt;enumeration value="PQB"/&gt;
 *     &lt;enumeration value="PQS"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PSB"/&gt;
 *     &lt;enumeration value="PSD"/&gt;
 *     &lt;enumeration value="PSS"/&gt;
 *     &lt;enumeration value="QCH"/&gt;
 *     &lt;enumeration value="QIC"/&gt;
 *     &lt;enumeration value="RMC"/&gt;
 *     &lt;enumeration value="RQB"/&gt;
 *     &lt;enumeration value="RQS"/&gt;
 *     &lt;enumeration value="RSB"/&gt;
 *     &lt;enumeration value="RSS"/&gt;
 *     &lt;enumeration value="SDC"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SDU"/&gt;
 *     &lt;enumeration value="SLC"/&gt;
 *     &lt;enumeration value="TTO"/&gt;
 *     &lt;enumeration value="VQD"/&gt;
 *     &lt;enumeration value="WDD"/&gt;
 *     &lt;enumeration value="WDP"/&gt;
 *     &lt;enumeration value="WDT"/&gt;
 *     &lt;enumeration value="WOC"/&gt;
 *     &lt;enumeration value="WOP"/&gt;
 *     &lt;enumeration value="WOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeReasonContentType")
@XmlEnum
public enum ChangeReasonContentType {

    AID,
    BDD,
    BWA,
    CCH,
    CCO,
    CHR,
    CIC,
    DMN,
    DPW,
    DQP,
    ESC,
    ETO,
    ICW,
    IPI,
    LTV,
    LYI,
    MDI,
    MSD,
    NAI,
    NBD,
    NBS,
    NCL,
    NGW,
    NMA,
    NMS,
    NRE,
    PIC,
    PQB,
    PQS,
    PRC,
    PSB,
    PSD,
    PSS,
    QCH,
    QIC,
    RMC,
    RQB,
    RQS,
    RSB,
    RSS,
    SDC,
    SDP,
    SDU,
    SLC,
    TTO,
    VQD,
    WDD,
    WDP,
    WDT,
    WOC,
    WOP,
    WOS;

    public String value() {
        return name();
    }

    public static ChangeReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
