
package io.dscope.rosettanet.domain.service.codelist.failureobservedcondition.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureObservedConditionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FailureObservedConditionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BSU"/&gt;
 *     &lt;enumeration value="BTD"/&gt;
 *     &lt;enumeration value="BVE"/&gt;
 *     &lt;enumeration value="BNR"/&gt;
 *     &lt;enumeration value="BWB"/&gt;
 *     &lt;enumeration value="DAC"/&gt;
 *     &lt;enumeration value="DCM"/&gt;
 *     &lt;enumeration value="DDS"/&gt;
 *     &lt;enumeration value="DLI"/&gt;
 *     &lt;enumeration value="DNV"/&gt;
 *     &lt;enumeration value="DTS"/&gt;
 *     &lt;enumeration value="DFS"/&gt;
 *     &lt;enumeration value="DFC"/&gt;
 *     &lt;enumeration value="DHB"/&gt;
 *     &lt;enumeration value="DIP"/&gt;
 *     &lt;enumeration value="DNB"/&gt;
 *     &lt;enumeration value="DPC"/&gt;
 *     &lt;enumeration value="DPR"/&gt;
 *     &lt;enumeration value="DRC"/&gt;
 *     &lt;enumeration value="DRV"/&gt;
 *     &lt;enumeration value="DUV"/&gt;
 *     &lt;enumeration value="DNS"/&gt;
 *     &lt;enumeration value="DBS"/&gt;
 *     &lt;enumeration value="DAD"/&gt;
 *     &lt;enumeration value="DNM"/&gt;
 *     &lt;enumeration value="DFE"/&gt;
 *     &lt;enumeration value="DID"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DLR"/&gt;
 *     &lt;enumeration value="DNY"/&gt;
 *     &lt;enumeration value="DNR"/&gt;
 *     &lt;enumeration value="DRW"/&gt;
 *     &lt;enumeration value="DNA"/&gt;
 *     &lt;enumeration value="DBR"/&gt;
 *     &lt;enumeration value="IDC"/&gt;
 *     &lt;enumeration value="IDF"/&gt;
 *     &lt;enumeration value="IDK"/&gt;
 *     &lt;enumeration value="IDI"/&gt;
 *     &lt;enumeration value="IDJ"/&gt;
 *     &lt;enumeration value="IDL"/&gt;
 *     &lt;enumeration value="IDU"/&gt;
 *     &lt;enumeration value="IDM"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IDT"/&gt;
 *     &lt;enumeration value="IDS"/&gt;
 *     &lt;enumeration value="MSC"/&gt;
 *     &lt;enumeration value="MSD"/&gt;
 *     &lt;enumeration value="MSG"/&gt;
 *     &lt;enumeration value="MSH"/&gt;
 *     &lt;enumeration value="MSI"/&gt;
 *     &lt;enumeration value="MSM"/&gt;
 *     &lt;enumeration value="MSP"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="MSS"/&gt;
 *     &lt;enumeration value="MSU"/&gt;
 *     &lt;enumeration value="MSB"/&gt;
 *     &lt;enumeration value="MCF"/&gt;
 *     &lt;enumeration value="MST"/&gt;
 *     &lt;enumeration value="MDA"/&gt;
 *     &lt;enumeration value="MDC"/&gt;
 *     &lt;enumeration value="PSB"/&gt;
 *     &lt;enumeration value="PSF"/&gt;
 *     &lt;enumeration value="PSC"/&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *     &lt;enumeration value="PSO"/&gt;
 *     &lt;enumeration value="PSR"/&gt;
 *     &lt;enumeration value="PSU"/&gt;
 *     &lt;enumeration value="PSP"/&gt;
 *     &lt;enumeration value="PSV"/&gt;
 *     &lt;enumeration value="PFA"/&gt;
 *     &lt;enumeration value="PFC"/&gt;
 *     &lt;enumeration value="PFF"/&gt;
 *     &lt;enumeration value="PFM"/&gt;
 *     &lt;enumeration value="PFI"/&gt;
 *     &lt;enumeration value="PFL"/&gt;
 *     &lt;enumeration value="PFO"/&gt;
 *     &lt;enumeration value="PFH"/&gt;
 *     &lt;enumeration value="PFP"/&gt;
 *     &lt;enumeration value="PFQ"/&gt;
 *     &lt;enumeration value="PFN"/&gt;
 *     &lt;enumeration value="PFE"/&gt;
 *     &lt;enumeration value="PFB"/&gt;
 *     &lt;enumeration value="PFS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureObservedConditionContentType")
@XmlEnum
public enum FailureObservedConditionContentType {

    BSU,
    BTD,
    BVE,
    BNR,
    BWB,
    DAC,
    DCM,
    DDS,
    DLI,
    DNV,
    DTS,
    DFS,
    DFC,
    DHB,
    DIP,
    DNB,
    DPC,
    DPR,
    DRC,
    DRV,
    DUV,
    DNS,
    DBS,
    DAD,
    DNM,
    DFE,
    DID,
    DIS,
    DLR,
    DNY,
    DNR,
    DRW,
    DNA,
    DBR,
    IDC,
    IDF,
    IDK,
    IDI,
    IDJ,
    IDL,
    IDU,
    IDM,
    IDR,
    IDT,
    IDS,
    MSC,
    MSD,
    MSG,
    MSH,
    MSI,
    MSM,
    MSP,
    MSR,
    MSS,
    MSU,
    MSB,
    MCF,
    MST,
    MDA,
    MDC,
    PSB,
    PSF,
    PSC,
    PSN,
    PSO,
    PSR,
    PSU,
    PSP,
    PSV,
    PFA,
    PFC,
    PFF,
    PFM,
    PFI,
    PFL,
    PFO,
    PFH,
    PFP,
    PFQ,
    PFN,
    PFE,
    PFB,
    PFS;

    public String value() {
        return name();
    }

    public static FailureObservedConditionContentType fromValue(String v) {
        return valueOf(v);
    }

}
