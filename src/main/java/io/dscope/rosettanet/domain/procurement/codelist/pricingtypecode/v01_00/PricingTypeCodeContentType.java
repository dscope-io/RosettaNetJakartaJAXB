
package io.dscope.rosettanet.domain.procurement.codelist.pricingtypecode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PricingTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ANY"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="ACR"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="BSH"/&gt;
 *     &lt;enumeration value="BPP"/&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="CMC"/&gt;
 *     &lt;enumeration value="CMD"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="CMF"/&gt;
 *     &lt;enumeration value="COS"/&gt;
 *     &lt;enumeration value="DBC"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DTP"/&gt;
 *     &lt;enumeration value="DFR"/&gt;
 *     &lt;enumeration value="DPD"/&gt;
 *     &lt;enumeration value="EDU"/&gt;
 *     &lt;enumeration value="ERT"/&gt;
 *     &lt;enumeration value="EXC"/&gt;
 *     &lt;enumeration value="FGM"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="HIE"/&gt;
 *     &lt;enumeration value="LIS"/&gt;
 *     &lt;enumeration value="LCL"/&gt;
 *     &lt;enumeration value="LGM"/&gt;
 *     &lt;enumeration value="MPR"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="MUS"/&gt;
 *     &lt;enumeration value="NPF"/&gt;
 *     &lt;enumeration value="OEM"/&gt;
 *     &lt;enumeration value="OVP"/&gt;
 *     &lt;enumeration value="PED"/&gt;
 *     &lt;enumeration value="RCS"/&gt;
 *     &lt;enumeration value="RFB"/&gt;
 *     &lt;enumeration value="RIN"/&gt;
 *     &lt;enumeration value="RSP"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="SED"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SEV"/&gt;
 *     &lt;enumeration value="SPE"/&gt;
 *     &lt;enumeration value="SRS"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="SGM"/&gt;
 *     &lt;enumeration value="SRR"/&gt;
 *     &lt;enumeration value="THP"/&gt;
 *     &lt;enumeration value="ACS"/&gt;
 *     &lt;enumeration value="ASP"/&gt;
 *     &lt;enumeration value="CP"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="MRP"/&gt;
 *     &lt;enumeration value="TOC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PricingTypeCodeContentType")
@XmlEnum
public enum PricingTypeCodeContentType {

    ANY,
    ACT,
    ACR,
    ARS,
    BSH,
    BPP,
    CAT,
    CMC,
    CMD,
    CON,
    CMF,
    COS,
    DBC,
    DIS,
    DTP,
    DFR,
    DPD,
    EDU,
    ERT,
    EXC,
    FGM,
    GEN,
    HIE,
    LIS,
    LCL,
    LGM,
    MPR,
    MSR,
    MUS,
    NPF,
    OEM,
    OVP,
    PED,
    RCS,
    RFB,
    RIN,
    RSP,
    SPL,
    SED,
    SEC,
    SEV,
    SPE,
    SRS,
    STR,
    SGM,
    SRR,
    THP,
    ACS,
    ASP,
    CP,
    CS,
    MRP,
    TOC;

    public String value() {
        return name();
    }

    public static PricingTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
