
package io.dscope.rosettanet.domain.procurement.codelist.businessaction.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessActionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BusinessActionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACP"/&gt;
 *     &lt;enumeration value="ACR"/&gt;
 *     &lt;enumeration value="ARQ"/&gt;
 *     &lt;enumeration value="ASA"/&gt;
 *     &lt;enumeration value="ASN"/&gt;
 *     &lt;enumeration value="BPA"/&gt;
 *     &lt;enumeration value="BPC"/&gt;
 *     &lt;enumeration value="BSN"/&gt;
 *     &lt;enumeration value="BSS"/&gt;
 *     &lt;enumeration value="CPL"/&gt;
 *     &lt;enumeration value="CPM"/&gt;
 *     &lt;enumeration value="CPS"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CRA"/&gt;
 *     &lt;enumeration value="CRQ"/&gt;
 *     &lt;enumeration value="CRR"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DAR"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *     &lt;enumeration value="DRC"/&gt;
 *     &lt;enumeration value="DRR"/&gt;
 *     &lt;enumeration value="EAP"/&gt;
 *     &lt;enumeration value="EAR"/&gt;
 *     &lt;enumeration value="ECI"/&gt;
 *     &lt;enumeration value="ECN"/&gt;
 *     &lt;enumeration value="ECO"/&gt;
 *     &lt;enumeration value="ECP"/&gt;
 *     &lt;enumeration value="ECR"/&gt;
 *     &lt;enumeration value="FAN"/&gt;
 *     &lt;enumeration value="FIP"/&gt;
 *     &lt;enumeration value="FIR"/&gt;
 *     &lt;enumeration value="IRN"/&gt;
 *     &lt;enumeration value="IVN"/&gt;
 *     &lt;enumeration value="IVR"/&gt;
 *     &lt;enumeration value="LIR"/&gt;
 *     &lt;enumeration value="MIQ"/&gt;
 *     &lt;enumeration value="MIR"/&gt;
 *     &lt;enumeration value="OPQ"/&gt;
 *     &lt;enumeration value="OPR"/&gt;
 *     &lt;enumeration value="OSN"/&gt;
 *     &lt;enumeration value="PAQ"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="PDQ"/&gt;
 *     &lt;enumeration value="PDR"/&gt;
 *     &lt;enumeration value="PIN"/&gt;
 *     &lt;enumeration value="PIQ"/&gt;
 *     &lt;enumeration value="PIR"/&gt;
 *     &lt;enumeration value="PLI"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PLQ"/&gt;
 *     &lt;enumeration value="PMI"/&gt;
 *     &lt;enumeration value="POA"/&gt;
 *     &lt;enumeration value="POC"/&gt;
 *     &lt;enumeration value="POH"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="POP"/&gt;
 *     &lt;enumeration value="POQ"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="PRU"/&gt;
 *     &lt;enumeration value="PSP"/&gt;
 *     &lt;enumeration value="PTI"/&gt;
 *     &lt;enumeration value="QRQ"/&gt;
 *     &lt;enumeration value="QRP"/&gt;
 *     &lt;enumeration value="RAN"/&gt;
 *     &lt;enumeration value="RPP"/&gt;
 *     &lt;enumeration value="RPR"/&gt;
 *     &lt;enumeration value="RRS"/&gt;
 *     &lt;enumeration value="RSN"/&gt;
 *     &lt;enumeration value="RSQ"/&gt;
 *     &lt;enumeration value="RSP"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *     &lt;enumeration value="SCF"/&gt;
 *     &lt;enumeration value="SCG"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SCS"/&gt;
 *     &lt;enumeration value="SCQ"/&gt;
 *     &lt;enumeration value="SCT"/&gt;
 *     &lt;enumeration value="SKU"/&gt;
 *     &lt;enumeration value="SMN"/&gt;
 *     &lt;enumeration value="SOC"/&gt;
 *     &lt;enumeration value="SON"/&gt;
 *     &lt;enumeration value="SOR"/&gt;
 *     &lt;enumeration value="SQR"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *     &lt;enumeration value="SPP"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="SRN"/&gt;
 *     &lt;enumeration value="SRP"/&gt;
 *     &lt;enumeration value="SRQ"/&gt;
 *     &lt;enumeration value="SSN"/&gt;
 *     &lt;enumeration value="SSP"/&gt;
 *     &lt;enumeration value="SSQ"/&gt;
 *     &lt;enumeration value="SSR"/&gt;
 *     &lt;enumeration value="SSS"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="TCP"/&gt;
 *     &lt;enumeration value="TCR"/&gt;
 *     &lt;enumeration value="TIQ"/&gt;
 *     &lt;enumeration value="TIR"/&gt;
 *     &lt;enumeration value="TPN"/&gt;
 *     &lt;enumeration value="UAS"/&gt;
 *     &lt;enumeration value="WCP"/&gt;
 *     &lt;enumeration value="WCR"/&gt;
 *     &lt;enumeration value="WOC"/&gt;
 *     &lt;enumeration value="WON"/&gt;
 *     &lt;enumeration value="WOR"/&gt;
 *     &lt;enumeration value="WOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessActionContentType")
@XmlEnum
public enum BusinessActionContentType {

    ACP,
    ACR,
    ARQ,
    ASA,
    ASN,
    BPA,
    BPC,
    BSN,
    BSS,
    CPL,
    CPM,
    CPS,
    CPT,
    CRA,
    CRQ,
    CRR,
    DAP,
    DAR,
    DEN,
    DRC,
    DRR,
    EAP,
    EAR,
    ECI,
    ECN,
    ECO,
    ECP,
    ECR,
    FAN,
    FIP,
    FIR,
    IRN,
    IVN,
    IVR,
    LIR,
    MIQ,
    MIR,
    OPQ,
    OPR,
    OSN,
    PAQ,
    PAR,
    PDQ,
    PDR,
    PIN,
    PIQ,
    PIR,
    PLI,
    PLN,
    PLQ,
    PMI,
    POA,
    POC,
    POH,
    PON,
    POP,
    POQ,
    POR,
    POS,
    PRN,
    PRU,
    PSP,
    PTI,
    QRQ,
    QRP,
    RAN,
    RPP,
    RPR,
    RRS,
    RSN,
    RSQ,
    RSP,
    SCC,
    SCF,
    SCG,
    SCP,
    SCR,
    SCS,
    SCQ,
    SCT,
    SKU,
    SMN,
    SOC,
    SON,
    SOR,
    SQR,
    SPC,
    SPP,
    SPR,
    SRN,
    SRP,
    SRQ,
    SSN,
    SSP,
    SSQ,
    SSR,
    SSS,
    STA,
    TCP,
    TCR,
    TIQ,
    TIR,
    TPN,
    UAS,
    WCP,
    WCR,
    WOC,
    WON,
    WOR,
    WOS;

    public String value() {
        return name();
    }

    public static BusinessActionContentType fromValue(String v) {
        return valueOf(v);
    }

}
