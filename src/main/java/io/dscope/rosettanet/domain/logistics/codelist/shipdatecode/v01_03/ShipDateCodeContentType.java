
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipDateCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipDateCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADY"/&gt;
 *     &lt;enumeration value="ACP"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFT"/&gt;
 *     &lt;enumeration value="APD"/&gt;
 *     &lt;enumeration value="APL"/&gt;
 *     &lt;enumeration value="ASD"/&gt;
 *     &lt;enumeration value="BDO"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BOI"/&gt;
 *     &lt;enumeration value="BPE"/&gt;
 *     &lt;enumeration value="BPS"/&gt;
 *     &lt;enumeration value="BRD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CBD"/&gt;
 *     &lt;enumeration value="CCL"/&gt;
 *     &lt;enumeration value="CDA"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="CFP"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *     &lt;enumeration value="CTO"/&gt;
 *     &lt;enumeration value="DAG"/&gt;
 *     &lt;enumeration value="DAR"/&gt;
 *     &lt;enumeration value="DAS"/&gt;
 *     &lt;enumeration value="DBT"/&gt;
 *     &lt;enumeration value="DDC"/&gt;
 *     &lt;enumeration value="DIC"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DLC"/&gt;
 *     &lt;enumeration value="DLD"/&gt;
 *     &lt;enumeration value="DNB"/&gt;
 *     &lt;enumeration value="DNL"/&gt;
 *     &lt;enumeration value="DOT"/&gt;
 *     &lt;enumeration value="DPA"/&gt;
 *     &lt;enumeration value="DRS"/&gt;
 *     &lt;enumeration value="DRT"/&gt;
 *     &lt;enumeration value="DRD"/&gt;
 *     &lt;enumeration value="DSP"/&gt;
 *     &lt;enumeration value="DUL"/&gt;
 *     &lt;enumeration value="DWO"/&gt;
 *     &lt;enumeration value="ECC"/&gt;
 *     &lt;enumeration value="ECL"/&gt;
 *     &lt;enumeration value="EPD"/&gt;
 *     &lt;enumeration value="EDA"/&gt;
 *     &lt;enumeration value="EDB"/&gt;
 *     &lt;enumeration value="EDD"/&gt;
 *     &lt;enumeration value="EDO"/&gt;
 *     &lt;enumeration value="EFD"/&gt;
 *     &lt;enumeration value="EPE"/&gt;
 *     &lt;enumeration value="EPS"/&gt;
 *     &lt;enumeration value="EES"/&gt;
 *     &lt;enumeration value="ESE"/&gt;
 *     &lt;enumeration value="ERE"/&gt;
 *     &lt;enumeration value="FBD"/&gt;
 *     &lt;enumeration value="FOD"/&gt;
 *     &lt;enumeration value="FSD"/&gt;
 *     &lt;enumeration value="GED"/&gt;
 *     &lt;enumeration value="IVD"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="LAC"/&gt;
 *     &lt;enumeration value="LDE"/&gt;
 *     &lt;enumeration value="LPD"/&gt;
 *     &lt;enumeration value="MNF"/&gt;
 *     &lt;enumeration value="MRB"/&gt;
 *     &lt;enumeration value="NTF"/&gt;
 *     &lt;enumeration value="OFD"/&gt;
 *     &lt;enumeration value="OPO"/&gt;
 *     &lt;enumeration value="ORD"/&gt;
 *     &lt;enumeration value="OTR"/&gt;
 *     &lt;enumeration value="PAG"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PCE"/&gt;
 *     &lt;enumeration value="PCL"/&gt;
 *     &lt;enumeration value="PCM"/&gt;
 *     &lt;enumeration value="PCS"/&gt;
 *     &lt;enumeration value="PDA"/&gt;
 *     &lt;enumeration value="PSD"/&gt;
 *     &lt;enumeration value="PBD"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="PMO"/&gt;
 *     &lt;enumeration value="PFE"/&gt;
 *     &lt;enumeration value="PFS"/&gt;
 *     &lt;enumeration value="PVE"/&gt;
 *     &lt;enumeration value="PVS"/&gt;
 *     &lt;enumeration value="PDE"/&gt;
 *     &lt;enumeration value="PDS"/&gt;
 *     &lt;enumeration value="PCO"/&gt;
 *     &lt;enumeration value="PCR"/&gt;
 *     &lt;enumeration value="PPD"/&gt;
 *     &lt;enumeration value="PPE"/&gt;
 *     &lt;enumeration value="PPS"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="PRQ"/&gt;
 *     &lt;enumeration value="PSH"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="PME"/&gt;
 *     &lt;enumeration value="PMS"/&gt;
 *     &lt;enumeration value="PMT"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="RDD"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="REL"/&gt;
 *     &lt;enumeration value="RPD"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="SLG"/&gt;
 *     &lt;enumeration value="SLD"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SDA"/&gt;
 *     &lt;enumeration value="SDC"/&gt;
 *     &lt;enumeration value="SLE"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="SPE"/&gt;
 *     &lt;enumeration value="SPS"/&gt;
 *     &lt;enumeration value="SPU"/&gt;
 *     &lt;enumeration value="SIG"/&gt;
 *     &lt;enumeration value="SHB"/&gt;
 *     &lt;enumeration value="SHL"/&gt;
 *     &lt;enumeration value="SHO"/&gt;
 *     &lt;enumeration value="SPP"/&gt;
 *     &lt;enumeration value="SPA"/&gt;
 *     &lt;enumeration value="SPN"/&gt;
 *     &lt;enumeration value="SSC"/&gt;
 *     &lt;enumeration value="SWO"/&gt;
 *     &lt;enumeration value="SIS"/&gt;
 *     &lt;enumeration value="SUD"/&gt;
 *     &lt;enumeration value="TDD"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TRS"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="VAL"/&gt;
 *     &lt;enumeration value="WIS"/&gt;
 *     &lt;enumeration value="WRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipDateCodeContentType")
@XmlEnum
public enum ShipDateCodeContentType {

    ADY,
    ACP,
    ACT,
    AED,
    AFT,
    APD,
    APL,
    ASD,
    BDO,
    BOL,
    BOI,
    BPE,
    BPS,
    BRD,
    CAD,
    CBD,
    CCL,
    CDA,
    COD,
    CFP,
    CFR,
    CPC,
    CRE,
    CTO,
    DAG,
    DAR,
    DAS,
    DBT,
    DDC,
    DIC,
    DIS,
    DLC,
    DLD,
    DNB,
    DNL,
    DOT,
    DPA,
    DRS,
    DRT,
    DRD,
    DSP,
    DUL,
    DWO,
    ECC,
    ECL,
    EPD,
    EDA,
    EDB,
    EDD,
    EDO,
    EFD,
    EPE,
    EPS,
    EES,
    ESE,
    ERE,
    FBD,
    FOD,
    FSD,
    GED,
    IVD,
    INS,
    LAC,
    LDE,
    LPD,
    MNF,
    MRB,
    NTF,
    OFD,
    OPO,
    ORD,
    OTR,
    PAG,
    PAS,
    PCE,
    PCL,
    PCM,
    PCS,
    PDA,
    PSD,
    PBD,
    PRE,
    PMO,
    PFE,
    PFS,
    PVE,
    PVS,
    PDE,
    PDS,
    PCO,
    PCR,
    PPD,
    PPE,
    PPS,
    PRD,
    PRQ,
    PSH,
    PRS,
    PME,
    PMS,
    PMT,
    REQ,
    RDD,
    REC,
    REJ,
    REL,
    RPD,
    RSD,
    SLG,
    SLD,
    SDD,
    SDA,
    SDC,
    SLE,
    SPL,
    SPE,
    SPS,
    SPU,
    SIG,
    SHB,
    SHL,
    SHO,
    SPP,
    SPA,
    SPN,
    SSC,
    SWO,
    SIS,
    SUD,
    TDD,
    TND,
    TRS,
    TRA,
    VAL,
    WIS,
    WRT;

    public String value() {
        return name();
    }

    public static ShipDateCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
