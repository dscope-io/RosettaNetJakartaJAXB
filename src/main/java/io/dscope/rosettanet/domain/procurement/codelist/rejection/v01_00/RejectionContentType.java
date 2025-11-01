
package io.dscope.rosettanet.domain.procurement.codelist.rejection.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RejectionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACA"/&gt;
 *     &lt;enumeration value="ACO"/&gt;
 *     &lt;enumeration value="AEX"/&gt;
 *     &lt;enumeration value="ALI"/&gt;
 *     &lt;enumeration value="ANM"/&gt;
 *     &lt;enumeration value="ACI"/&gt;
 *     &lt;enumeration value="ACJ"/&gt;
 *     &lt;enumeration value="ACM"/&gt;
 *     &lt;enumeration value="BCI"/&gt;
 *     &lt;enumeration value="BCJ"/&gt;
 *     &lt;enumeration value="BCK"/&gt;
 *     &lt;enumeration value="BCL"/&gt;
 *     &lt;enumeration value="BCM"/&gt;
 *     &lt;enumeration value="CCI"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="CND"/&gt;
 *     &lt;enumeration value="CNI"/&gt;
 *     &lt;enumeration value="CPN"/&gt;
 *     &lt;enumeration value="DRN"/&gt;
 *     &lt;enumeration value="DIN"/&gt;
 *     &lt;enumeration value="DIO"/&gt;
 *     &lt;enumeration value="DBI"/&gt;
 *     &lt;enumeration value="MPN"/&gt;
 *     &lt;enumeration value="MDA"/&gt;
 *     &lt;enumeration value="NCA"/&gt;
 *     &lt;enumeration value="OAD"/&gt;
 *     &lt;enumeration value="OAN"/&gt;
 *     &lt;enumeration value="OAO"/&gt;
 *     &lt;enumeration value="PNI"/&gt;
 *     &lt;enumeration value="PNJ"/&gt;
 *     &lt;enumeration value="PNN"/&gt;
 *     &lt;enumeration value="PNO"/&gt;
 *     &lt;enumeration value="PNA"/&gt;
 *     &lt;enumeration value="QEX"/&gt;
 *     &lt;enumeration value="QEY"/&gt;
 *     &lt;enumeration value="QNA"/&gt;
 *     &lt;enumeration value="QNI"/&gt;
 *     &lt;enumeration value="RAP"/&gt;
 *     &lt;enumeration value="RQI"/&gt;
 *     &lt;enumeration value="RIN"/&gt;
 *     &lt;enumeration value="RPI"/&gt;
 *     &lt;enumeration value="RPJ"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="STC"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SCI"/&gt;
 *     &lt;enumeration value="SNI"/&gt;
 *     &lt;enumeration value="SAL"/&gt;
 *     &lt;enumeration value="TOC"/&gt;
 *     &lt;enumeration value="UOM"/&gt;
 *     &lt;enumeration value="UBC"/&gt;
 *     &lt;enumeration value="VAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionContentType")
@XmlEnum
public enum RejectionContentType {

    ACA,
    ACO,
    AEX,
    ALI,
    ANM,
    ACI,
    ACJ,
    ACM,
    BCI,
    BCJ,
    BCK,
    BCL,
    BCM,
    CCI,
    CIN,
    CND,
    CNI,
    CPN,
    DRN,
    DIN,
    DIO,
    DBI,
    MPN,
    MDA,
    NCA,
    OAD,
    OAN,
    OAO,
    PNI,
    PNJ,
    PNN,
    PNO,
    PNA,
    QEX,
    QEY,
    QNA,
    QNI,
    RAP,
    RQI,
    RIN,
    RPI,
    RPJ,
    SDN,
    STC,
    STD,
    SCI,
    SNI,
    SAL,
    TOC,
    UOM,
    UBC,
    VAC;

    public String value() {
        return name();
    }

    public static RejectionContentType fromValue(String v) {
        return valueOf(v);
    }

}
