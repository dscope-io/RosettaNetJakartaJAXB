
package io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevicePackageTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DevicePackageTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BCC"/&gt;
 *     &lt;enumeration value="BGA"/&gt;
 *     &lt;enumeration value="CSB"/&gt;
 *     &lt;enumeration value="CSP"/&gt;
 *     &lt;enumeration value="FCB"/&gt;
 *     &lt;enumeration value="FCC"/&gt;
 *     &lt;enumeration value="FIL"/&gt;
 *     &lt;enumeration value="HPF"/&gt;
 *     &lt;enumeration value="HQF"/&gt;
 *     &lt;enumeration value="HSB"/&gt;
 *     &lt;enumeration value="LBG"/&gt;
 *     &lt;enumeration value="LFB"/&gt;
 *     &lt;enumeration value="LGA"/&gt;
 *     &lt;enumeration value="LQF"/&gt;
 *     &lt;enumeration value="MCM"/&gt;
 *     &lt;enumeration value="MPB"/&gt;
 *     &lt;enumeration value="PDI"/&gt;
 *     &lt;enumeration value="PLC"/&gt;
 *     &lt;enumeration value="QFN"/&gt;
 *     &lt;enumeration value="QFP"/&gt;
 *     &lt;enumeration value="SOJ"/&gt;
 *     &lt;enumeration value="SOP"/&gt;
 *     &lt;enumeration value="SPB"/&gt;
 *     &lt;enumeration value="SSO"/&gt;
 *     &lt;enumeration value="TAB"/&gt;
 *     &lt;enumeration value="TBG"/&gt;
 *     &lt;enumeration value="TFB"/&gt;
 *     &lt;enumeration value="TPC"/&gt;
 *     &lt;enumeration value="TQF"/&gt;
 *     &lt;enumeration value="TSO"/&gt;
 *     &lt;enumeration value="UBG"/&gt;
 *     &lt;enumeration value="UFP"/&gt;
 *     &lt;enumeration value="VBG"/&gt;
 *     &lt;enumeration value="VFB"/&gt;
 *     &lt;enumeration value="VIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevicePackageTypeContentType")
@XmlEnum
public enum DevicePackageTypeContentType {

    BCC,
    BGA,
    CSB,
    CSP,
    FCB,
    FCC,
    FIL,
    HPF,
    HQF,
    HSB,
    LBG,
    LFB,
    LGA,
    LQF,
    MCM,
    MPB,
    PDI,
    PLC,
    QFN,
    QFP,
    SOJ,
    SOP,
    SPB,
    SSO,
    TAB,
    TBG,
    TFB,
    TPC,
    TQF,
    TSO,
    UBG,
    UFP,
    VBG,
    VFB,
    VIP;

    public String value() {
        return name();
    }

    public static DevicePackageTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
