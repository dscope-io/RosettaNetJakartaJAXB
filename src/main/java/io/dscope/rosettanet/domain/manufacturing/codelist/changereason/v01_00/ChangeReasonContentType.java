
package io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
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
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CCh"/&gt;
 *     &lt;enumeration value="CHR"/&gt;
 *     &lt;enumeration value="CIC"/&gt;
 *     &lt;enumeration value="DMN"/&gt;
 *     &lt;enumeration value="DPW"/&gt;
 *     &lt;enumeration value="DQP"/&gt;
 *     &lt;enumeration value="ESC"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="ICW"/&gt;
 *     &lt;enumeration value="LTV"/&gt;
 *     &lt;enumeration value="LY"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MSD"/&gt;
 *     &lt;enumeration value="NAI"/&gt;
 *     &lt;enumeration value="NBD"/&gt;
 *     &lt;enumeration value="NBS"/&gt;
 *     &lt;enumeration value="NCL"/&gt;
 *     &lt;enumeration value="NGW"/&gt;
 *     &lt;enumeration value="NM"/&gt;
 *     &lt;enumeration value="NMS"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="PIC"/&gt;
 *     &lt;enumeration value="PII"/&gt;
 *     &lt;enumeration value="PMQ"/&gt;
 *     &lt;enumeration value="PMR"/&gt;
 *     &lt;enumeration value="PMS"/&gt;
 *     &lt;enumeration value="PMT"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PSD"/&gt;
 *     &lt;enumeration value="QC"/&gt;
 *     &lt;enumeration value="QIC"/&gt;
 *     &lt;enumeration value="RMC"/&gt;
 *     &lt;enumeration value="RMQ"/&gt;
 *     &lt;enumeration value="RMR"/&gt;
 *     &lt;enumeration value="RMS"/&gt;
 *     &lt;enumeration value="RMT"/&gt;
 *     &lt;enumeration value="SDC"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SDU"/&gt;
 *     &lt;enumeration value="SLC"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="VQP"/&gt;
 *     &lt;enumeration value="W/D"/&gt;
 *     &lt;enumeration value="W/E"/&gt;
 *     &lt;enumeration value="W/F"/&gt;
 *     &lt;enumeration value="WO"/&gt;
 *     &lt;enumeration value="WOM"/&gt;
 *     &lt;enumeration value="WOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeReasonContentType")
@XmlEnum
public enum ChangeReasonContentType {

    AID("AID"),
    BDD("BDD"),
    BW("BW"),
    CC("CC"),
    @XmlEnumValue("CCh")
    C_CH("CCh"),
    CHR("CHR"),
    CIC("CIC"),
    DMN("DMN"),
    DPW("DPW"),
    DQP("DQP"),
    ESC("ESC"),
    ET("ET"),
    ICW("ICW"),
    LTV("LTV"),
    LY("LY"),
    MD("MD"),
    MSD("MSD"),
    NAI("NAI"),
    NBD("NBD"),
    NBS("NBS"),
    NCL("NCL"),
    NGW("NGW"),
    NM("NM"),
    NMS("NMS"),
    NR("NR"),
    PIC("PIC"),
    PII("PII"),
    PMQ("PMQ"),
    PMR("PMR"),
    PMS("PMS"),
    PMT("PMT"),
    PRC("PRC"),
    PSD("PSD"),
    QC("QC"),
    QIC("QIC"),
    RMC("RMC"),
    RMQ("RMQ"),
    RMR("RMR"),
    RMS("RMS"),
    RMT("RMT"),
    SDC("SDC"),
    SDP("SDP"),
    SDU("SDU"),
    SLC("SLC"),
    TT("TT"),
    VQP("VQP"),
    @XmlEnumValue("W/D")
    W_D("W/D"),
    @XmlEnumValue("W/E")
    W_E("W/E"),
    @XmlEnumValue("W/F")
    W_F("W/F"),
    WO("WO"),
    WOM("WOM"),
    WOT("WOT");
    private final String value;

    ChangeReasonContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeReasonContentType fromValue(String v) {
        for (ChangeReasonContentType c: ChangeReasonContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
