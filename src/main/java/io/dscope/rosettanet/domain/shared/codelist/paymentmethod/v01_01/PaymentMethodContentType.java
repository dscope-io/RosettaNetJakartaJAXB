
package io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BAD"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="DBT"/&gt;
 *     &lt;enumeration value="DWO"/&gt;
 *     &lt;enumeration value="LAP"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="PAM"/&gt;
 *     &lt;enumeration value="PAN"/&gt;
 *     &lt;enumeration value="PBC"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PIK"/&gt;
 *     &lt;enumeration value="PME"/&gt;
 *     &lt;enumeration value="PMI"/&gt;
 *     &lt;enumeration value="PPC"/&gt;
 *     &lt;enumeration value="PPW"/&gt;
 *     &lt;enumeration value="PWT"/&gt;
 *     &lt;enumeration value="TOF"/&gt;
 *     &lt;enumeration value="MOR"/&gt;
 *     &lt;enumeration value="TGT"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="PYN"/&gt;
 *     &lt;enumeration value="PMN"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PBS"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodContentType")
@XmlEnum
public enum PaymentMethodContentType {

    BAD,
    CRC,
    DBT,
    DWO,
    LAP,
    LOC,
    NPR,
    PAM,
    PAN,
    PBC,
    PCC,
    PIK,
    PME,
    PMI,
    PPC,
    PPW,
    PWT,
    TOF,
    MOR,
    TGT,
    MOD,
    PYN,
    PMN,
    PAS,
    PBS,
    OTH;

    public String value() {
        return name();
    }

    public static PaymentMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
