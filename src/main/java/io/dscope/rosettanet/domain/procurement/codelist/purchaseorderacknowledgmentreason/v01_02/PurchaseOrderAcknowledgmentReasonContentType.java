
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderAcknowledgmentReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderAcknowledgmentReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="ALA"/&gt;
 *     &lt;enumeration value="CRH"/&gt;
 *     &lt;enumeration value="EXR"/&gt;
 *     &lt;enumeration value="IBI"/&gt;
 *     &lt;enumeration value="IBT"/&gt;
 *     &lt;enumeration value="IFC"/&gt;
 *     &lt;enumeration value="IGT"/&gt;
 *     &lt;enumeration value="IID"/&gt;
 *     &lt;enumeration value="INB"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="INI"/&gt;
 *     &lt;enumeration value="INP"/&gt;
 *     &lt;enumeration value="IPL"/&gt;
 *     &lt;enumeration value="IQR"/&gt;
 *     &lt;enumeration value="IST"/&gt;
 *     &lt;enumeration value="NAU"/&gt;
 *     &lt;enumeration value="OGT"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PPO"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="RNC"/&gt;
 *     &lt;enumeration value="RNW"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="ISN"/&gt;
 *     &lt;enumeration value="DSN"/&gt;
 *     &lt;enumeration value="SRL"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="CNO"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="QTY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderAcknowledgmentReasonContentType")
@XmlEnum
public enum PurchaseOrderAcknowledgmentReasonContentType {

    ACC,
    ALA,
    CRH,
    EXR,
    IBI,
    IBT,
    IFC,
    IGT,
    IID,
    INB,
    INC,
    INI,
    INP,
    IPL,
    IQR,
    IST,
    NAU,
    OGT,
    PAR,
    PAS,
    PEN,
    PPO,
    PRI,
    PRS,
    RNC,
    RNW,
    ISL,
    ISN,
    DSN,
    SRL,
    DAT,
    CNO,
    IPO,
    QTY;

    public String value() {
        return name();
    }

    public static PurchaseOrderAcknowledgmentReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
