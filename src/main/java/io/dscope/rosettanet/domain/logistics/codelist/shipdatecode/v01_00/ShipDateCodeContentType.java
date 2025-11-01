
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipDateCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipDateCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="ASD"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="AFT"/&gt;
 *     &lt;enumeration value="APD"/&gt;
 *     &lt;enumeration value="APL"/&gt;
 *     &lt;enumeration value="AAD"/&gt;
 *     &lt;enumeration value="BRD"/&gt;
 *     &lt;enumeration value="BDO"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BOM"/&gt;
 *     &lt;enumeration value="BPD"/&gt;
 *     &lt;enumeration value="BPE"/&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="CBD"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CTO"/&gt;
 *     &lt;enumeration value="CDA"/&gt;
 *     &lt;enumeration value="CCL"/&gt;
 *     &lt;enumeration value="CFP"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *     &lt;enumeration value="CDB"/&gt;
 *     &lt;enumeration value="DAR"/&gt;
 *     &lt;enumeration value="DDC"/&gt;
 *     &lt;enumeration value="DIC"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DLC"/&gt;
 *     &lt;enumeration value="DLD"/&gt;
 *     &lt;enumeration value="DST"/&gt;
 *     &lt;enumeration value="DUN"/&gt;
 *     &lt;enumeration value="DNL"/&gt;
 *     &lt;enumeration value="DNB"/&gt;
 *     &lt;enumeration value="DWO"/&gt;
 *     &lt;enumeration value="DBT"/&gt;
 *     &lt;enumeration value="DOT"/&gt;
 *     &lt;enumeration value="DAG"/&gt;
 *     &lt;enumeration value="DAS"/&gt;
 *     &lt;enumeration value="DRO"/&gt;
 *     &lt;enumeration value="DRS"/&gt;
 *     &lt;enumeration value="DRD"/&gt;
 *     &lt;enumeration value="DPA"/&gt;
 *     &lt;enumeration value="EPD"/&gt;
 *     &lt;enumeration value="EDA"/&gt;
 *     &lt;enumeration value="EDO"/&gt;
 *     &lt;enumeration value="EFD"/&gt;
 *     &lt;enumeration value="ENP"/&gt;
 *     &lt;enumeration value="ENQ"/&gt;
 *     &lt;enumeration value="ENR"/&gt;
 *     &lt;enumeration value="ENS"/&gt;
 *     &lt;enumeration value="ECC"/&gt;
 *     &lt;enumeration value="EDD"/&gt;
 *     &lt;enumeration value="ERE"/&gt;
 *     &lt;enumeration value="EDB"/&gt;
 *     &lt;enumeration value="ECL"/&gt;
 *     &lt;enumeration value="FOD"/&gt;
 *     &lt;enumeration value="FSD"/&gt;
 *     &lt;enumeration value="FBD"/&gt;
 *     &lt;enumeration value="GED"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="IDA"/&gt;
 *     &lt;enumeration value="LAC"/&gt;
 *     &lt;enumeration value="LDE"/&gt;
 *     &lt;enumeration value="LPD"/&gt;
 *     &lt;enumeration value="MAN"/&gt;
 *     &lt;enumeration value="MRB"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="OFD"/&gt;
 *     &lt;enumeration value="ORD"/&gt;
 *     &lt;enumeration value="OPO"/&gt;
 *     &lt;enumeration value="OTR"/&gt;
 *     &lt;enumeration value="PDA"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PAG"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="PPD"/&gt;
 *     &lt;enumeration value="PCE"/&gt;
 *     &lt;enumeration value="PCL"/&gt;
 *     &lt;enumeration value="PCM"/&gt;
 *     &lt;enumeration value="PCN"/&gt;
 *     &lt;enumeration value="PDB"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="PEO"/&gt;
 *     &lt;enumeration value="PFS"/&gt;
 *     &lt;enumeration value="PFT"/&gt;
 *     &lt;enumeration value="PIP"/&gt;
 *     &lt;enumeration value="PIQ"/&gt;
 *     &lt;enumeration value="POD"/&gt;
 *     &lt;enumeration value="POE"/&gt;
 *     &lt;enumeration value="PPE"/&gt;
 *     &lt;enumeration value="PPF"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="PSD"/&gt;
 *     &lt;enumeration value="PSE"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *     &lt;enumeration value="PDC"/&gt;
 *     &lt;enumeration value="POF"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="REL"/&gt;
 *     &lt;enumeration value="RDD"/&gt;
 *     &lt;enumeration value="RPD"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RBY"/&gt;
 *     &lt;enumeration value="SDA"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SDE"/&gt;
 *     &lt;enumeration value="SDF"/&gt;
 *     &lt;enumeration value="SPD"/&gt;
 *     &lt;enumeration value="SPE"/&gt;
 *     &lt;enumeration value="SPF"/&gt;
 *     &lt;enumeration value="SSC"/&gt;
 *     &lt;enumeration value="SEX"/&gt;
 *     &lt;enumeration value="SNB"/&gt;
 *     &lt;enumeration value="SNL"/&gt;
 *     &lt;enumeration value="SWO"/&gt;
 *     &lt;enumeration value="SOT"/&gt;
 *     &lt;enumeration value="SIG"/&gt;
 *     &lt;enumeration value="SDB"/&gt;
 *     &lt;enumeration value="SFL"/&gt;
 *     &lt;enumeration value="SFM"/&gt;
 *     &lt;enumeration value="SFS"/&gt;
 *     &lt;enumeration value="SFU"/&gt;
 *     &lt;enumeration value="SIS"/&gt;
 *     &lt;enumeration value="SDC"/&gt;
 *     &lt;enumeration value="TDD"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TCD"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="VAL"/&gt;
 *     &lt;enumeration value="WIS"/&gt;
 *     &lt;enumeration value="WEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipDateCodeContentType")
@XmlEnum
public enum ShipDateCodeContentType {

    ACC,
    AED,
    ASD,
    ACT,
    AFT,
    APD,
    APL,
    AAD,
    BRD,
    BDO,
    BOL,
    BOM,
    BPD,
    BPE,
    CAT,
    CBD,
    CFR,
    CTO,
    CDA,
    CCL,
    CFP,
    CPC,
    CRE,
    CDB,
    DAR,
    DDC,
    DIC,
    DIS,
    DLC,
    DLD,
    DST,
    DUN,
    DNL,
    DNB,
    DWO,
    DBT,
    DOT,
    DAG,
    DAS,
    DRO,
    DRS,
    DRD,
    DPA,
    EPD,
    EDA,
    EDO,
    EFD,
    ENP,
    ENQ,
    ENR,
    ENS,
    ECC,
    EDD,
    ERE,
    EDB,
    ECL,
    FOD,
    FSD,
    FBD,
    GED,
    INS,
    IDA,
    LAC,
    LDE,
    LPD,
    MAN,
    MRB,
    NOT,
    OFD,
    ORD,
    OPO,
    OTR,
    PDA,
    PEN,
    PAG,
    PAS,
    PRS,
    PPD,
    PCE,
    PCL,
    PCM,
    PCN,
    PDB,
    PRD,
    PEO,
    PFS,
    PFT,
    PIP,
    PIQ,
    POD,
    POE,
    PPE,
    PPF,
    PRE,
    PRF,
    PSD,
    PSE,
    PST,
    PDC,
    POF,
    POR,
    REC,
    REJ,
    REL,
    RDD,
    RPD,
    RSD,
    RBY,
    SDA,
    SDD,
    SDE,
    SDF,
    SPD,
    SPE,
    SPF,
    SSC,
    SEX,
    SNB,
    SNL,
    SWO,
    SOT,
    SIG,
    SDB,
    SFL,
    SFM,
    SFS,
    SFU,
    SIS,
    SDC,
    TDD,
    TND,
    TCD,
    TRA,
    VAL,
    WIS,
    WEX;

    public String value() {
        return name();
    }

    public static ShipDateCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
