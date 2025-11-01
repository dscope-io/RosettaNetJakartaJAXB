
package io.dscope.rosettanet.universal.codelist.documenttype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CBN"/&gt;
 *     &lt;enumeration value="CCN"/&gt;
 *     &lt;enumeration value="CFA"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="CNM"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="COT"/&gt;
 *     &lt;enumeration value="CRN"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *     &lt;enumeration value="DIN"/&gt;
 *     &lt;enumeration value="DRN"/&gt;
 *     &lt;enumeration value="FUO"/&gt;
 *     &lt;enumeration value="INV"/&gt;
 *     &lt;enumeration value="LID"/&gt;
 *     &lt;enumeration value="MEN"/&gt;
 *     &lt;enumeration value="MID"/&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="OCL"/&gt;
 *     &lt;enumeration value="OPO"/&gt;
 *     &lt;enumeration value="OPR"/&gt;
 *     &lt;enumeration value="PFA"/&gt;
 *     &lt;enumeration value="PII"/&gt;
 *     &lt;enumeration value="PLS"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PSI"/&gt;
 *     &lt;enumeration value="PUO"/&gt;
 *     &lt;enumeration value="QUO"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REO"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="RMA"/&gt;
 *     &lt;enumeration value="RPO"/&gt;
 *     &lt;enumeration value="SAO"/&gt;
 *     &lt;enumeration value="SBC"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SBI"/&gt;
 *     &lt;enumeration value="SBN"/&gt;
 *     &lt;enumeration value="SCA"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SEO"/&gt;
 *     &lt;enumeration value="SNC"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *     &lt;enumeration value="SPN"/&gt;
 *     &lt;enumeration value="SPO"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="SPW"/&gt;
 *     &lt;enumeration value="SRI"/&gt;
 *     &lt;enumeration value="TRO"/&gt;
 *     &lt;enumeration value="WAB"/&gt;
 *     &lt;enumeration value="WAC"/&gt;
 *     &lt;enumeration value="WOO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeContentType")
@XmlEnum
public enum DocumentTypeContentType {

    CBN,
    CCN,
    CFA,
    CIN,
    CNM,
    CON,
    COT,
    CRN,
    DEM,
    DEN,
    DIN,
    DRN,
    FUO,
    INV,
    LID,
    MEN,
    MID,
    MON,
    OCL,
    OPO,
    OPR,
    PFA,
    PII,
    PLS,
    POI,
    PON,
    POO,
    PRC,
    PSI,
    PUO,
    QUO,
    REC,
    REO,
    REQ,
    RMA,
    RPO,
    SAO,
    SBC,
    SBD,
    SBI,
    SBN,
    SCA,
    SEN,
    SEO,
    SNC,
    SPC,
    SPN,
    SPO,
    SPR,
    SPW,
    SRI,
    TRO,
    WAB,
    WAC,
    WOO;

    public String value() {
        return name();
    }

    public static DocumentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
