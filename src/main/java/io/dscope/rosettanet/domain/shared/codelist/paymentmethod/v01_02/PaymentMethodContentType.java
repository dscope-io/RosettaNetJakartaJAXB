
package io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACH"/&gt;
 *     &lt;enumeration value="ACR"/&gt;
 *     &lt;enumeration value="BAD"/&gt;
 *     &lt;enumeration value="BIA"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOE"/&gt;
 *     &lt;enumeration value="CAC"/&gt;
 *     &lt;enumeration value="CAS"/&gt;
 *     &lt;enumeration value="CBB"/&gt;
 *     &lt;enumeration value="CCP"/&gt;
 *     &lt;enumeration value="CCR"/&gt;
 *     &lt;enumeration value="CCW"/&gt;
 *     &lt;enumeration value="CDA"/&gt;
 *     &lt;enumeration value="CDD"/&gt;
 *     &lt;enumeration value="CDP"/&gt;
 *     &lt;enumeration value="CDS"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="CHIPS"/&gt;
 *     &lt;enumeration value="CLH"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CPF"/&gt;
 *     &lt;enumeration value="CPP"/&gt;
 *     &lt;enumeration value="CRA"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *     &lt;enumeration value="CTC"/&gt;
 *     &lt;enumeration value="CTD"/&gt;
 *     &lt;enumeration value="CTP"/&gt;
 *     &lt;enumeration value="CTX"/&gt;
 *     &lt;enumeration value="CXC"/&gt;
 *     &lt;enumeration value="CXD"/&gt;
 *     &lt;enumeration value="DBT"/&gt;
 *     &lt;enumeration value="DCC"/&gt;
 *     &lt;enumeration value="DCD"/&gt;
 *     &lt;enumeration value="DCP"/&gt;
 *     &lt;enumeration value="DDA"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="DEB"/&gt;
 *     &lt;enumeration value="DEC"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DID"/&gt;
 *     &lt;enumeration value="DPP"/&gt;
 *     &lt;enumeration value="DRA"/&gt;
 *     &lt;enumeration value="DWO"/&gt;
 *     &lt;enumeration value="ECN"/&gt;
 *     &lt;enumeration value="EPS"/&gt;
 *     &lt;enumeration value="EFT"/&gt;
 *     &lt;enumeration value="EXC"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="FIO"/&gt;
 *     &lt;enumeration value="FPB"/&gt;
 *     &lt;enumeration value="FRN"/&gt;
 *     &lt;enumeration value="FRR"/&gt;
 *     &lt;enumeration value="GRA"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="JPO"/&gt;
 *     &lt;enumeration value="LAP"/&gt;
 *     &lt;enumeration value="LEV"/&gt;
 *     &lt;enumeration value="LOB"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="MOO"/&gt;
 *     &lt;enumeration value="MOR"/&gt;
 *     &lt;enumeration value="NPD"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PAM"/&gt;
 *     &lt;enumeration value="PAN"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PBC"/&gt;
 *     &lt;enumeration value="PBS"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PCP"/&gt;
 *     &lt;enumeration value="PDD"/&gt;
 *     &lt;enumeration value="PDP"/&gt;
 *     &lt;enumeration value="PIK"/&gt;
 *     &lt;enumeration value="PME"/&gt;
 *     &lt;enumeration value="PMI"/&gt;
 *     &lt;enumeration value="PMN"/&gt;
 *     &lt;enumeration value="PNA"/&gt;
 *     &lt;enumeration value="PPC"/&gt;
 *     &lt;enumeration value="PPD"/&gt;
 *     &lt;enumeration value="PPW"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="PVN"/&gt;
 *     &lt;enumeration value="PWT"/&gt;
 *     &lt;enumeration value="PYN"/&gt;
 *     &lt;enumeration value="RDA"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *     &lt;enumeration value="SCD"/&gt;
 *     &lt;enumeration value="SPA"/&gt;
 *     &lt;enumeration value="SUA"/&gt;
 *     &lt;enumeration value="SWIFT"/&gt;
 *     &lt;enumeration value="TGT"/&gt;
 *     &lt;enumeration value="TOF"/&gt;
 *     &lt;enumeration value="TRC"/&gt;
 *     &lt;enumeration value="VIS"/&gt;
 *     &lt;enumeration value="WAI"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodContentType")
@XmlEnum
public enum PaymentMethodContentType {

    ACH,
    ACR,
    BAD,
    BIA,
    BND,
    BOE,
    CAC,
    CAS,
    CBB,
    CCP,
    CCR,
    CCW,
    CDA,
    CDD,
    CDP,
    CDS,
    CHE,
    CHIPS,
    CLH,
    CPC,
    CPF,
    CPP,
    CRA,
    CRC,
    CRE,
    CTC,
    CTD,
    CTP,
    CTX,
    CXC,
    CXD,
    DBT,
    DCC,
    DCD,
    DCP,
    DDA,
    DDP,
    DEB,
    DEC,
    DEM,
    DID,
    DPP,
    DRA,
    DWO,
    ECN,
    EPS,
    EFT,
    EXC,
    FIN,
    FIO,
    FPB,
    FRN,
    FRR,
    GRA,
    INS,
    JPO,
    LAP,
    LEV,
    LOB,
    LOC,
    MOD,
    MOO,
    MOR,
    NPD,
    NPR,
    OTH,
    PAM,
    PAN,
    PAS,
    PBC,
    PBS,
    PCC,
    PCP,
    PDD,
    PDP,
    PIK,
    PME,
    PMI,
    PMN,
    PNA,
    PPC,
    PPD,
    PPW,
    PRC,
    PRN,
    PVC,
    PVN,
    PWT,
    PYN,
    RDA,
    SCC,
    SCD,
    SPA,
    SUA,
    SWIFT,
    TGT,
    TOF,
    TRC,
    VIS,
    WAI,
    WIT;

    public String value() {
        return name();
    }

    public static PaymentMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
