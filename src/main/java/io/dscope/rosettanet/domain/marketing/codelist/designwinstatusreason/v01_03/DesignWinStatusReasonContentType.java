
package io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignWinStatusReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DesignWinStatusReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAP"/&gt;
 *     &lt;enumeration value="CMA"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="CRP"/&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="DAD"/&gt;
 *     &lt;enumeration value="DCL"/&gt;
 *     &lt;enumeration value="DRE"/&gt;
 *     &lt;enumeration value="DWD"/&gt;
 *     &lt;enumeration value="EDR"/&gt;
 *     &lt;enumeration value="ICC"/&gt;
 *     &lt;enumeration value="ICD"/&gt;
 *     &lt;enumeration value="ICE"/&gt;
 *     &lt;enumeration value="IIN"/&gt;
 *     &lt;enumeration value="IOA"/&gt;
 *     &lt;enumeration value="ION"/&gt;
 *     &lt;enumeration value="IOS"/&gt;
 *     &lt;enumeration value="IPC"/&gt;
 *     &lt;enumeration value="IPN"/&gt;
 *     &lt;enumeration value="IPP"/&gt;
 *     &lt;enumeration value="IPQ"/&gt;
 *     &lt;enumeration value="IPR"/&gt;
 *     &lt;enumeration value="IPS"/&gt;
 *     &lt;enumeration value="IPT"/&gt;
 *     &lt;enumeration value="LDE"/&gt;
 *     &lt;enumeration value="MDG"/&gt;
 *     &lt;enumeration value="NAR"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *     &lt;enumeration value="NCR"/&gt;
 *     &lt;enumeration value="NDF"/&gt;
 *     &lt;enumeration value="NES"/&gt;
 *     &lt;enumeration value="NSB"/&gt;
 *     &lt;enumeration value="OAT"/&gt;
 *     &lt;enumeration value="PCB"/&gt;
 *     &lt;enumeration value="PDB"/&gt;
 *     &lt;enumeration value="PNN"/&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *     &lt;enumeration value="PWD"/&gt;
 *     &lt;enumeration value="QMN"/&gt;
 *     &lt;enumeration value="RFI"/&gt;
 *     &lt;enumeration value="RIN"/&gt;
 *     &lt;enumeration value="RNI"/&gt;
 *     &lt;enumeration value="SMN"/&gt;
 *     &lt;enumeration value="URE"/&gt;
 *     &lt;enumeration value="VNH"/&gt;
 *     &lt;enumeration value="WCN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DesignWinStatusReasonContentType")
@XmlEnum
public enum DesignWinStatusReasonContentType {

    CAP,
    CMA,
    COO,
    CRP,
    CRT,
    DAD,
    DCL,
    DRE,
    DWD,
    EDR,
    ICC,
    ICD,
    ICE,
    IIN,
    IOA,
    ION,
    IOS,
    IPC,
    IPN,
    IPP,
    IPQ,
    IPR,
    IPS,
    IPT,
    LDE,
    MDG,
    NAR,
    NAV,
    NCR,
    NDF,
    NES,
    NSB,
    OAT,
    PCB,
    PDB,
    PNN,
    PSN,
    PWD,
    QMN,
    RFI,
    RIN,
    RNI,
    SMN,
    URE,
    VNH,
    WCN;

    public String value() {
        return name();
    }

    public static DesignWinStatusReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
