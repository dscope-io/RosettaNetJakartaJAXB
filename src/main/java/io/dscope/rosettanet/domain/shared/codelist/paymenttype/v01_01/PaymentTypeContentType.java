
package io.dscope.rosettanet.domain.shared.codelist.paymenttype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CUR"/&gt;
 *     &lt;enumeration value="DBD"/&gt;
 *     &lt;enumeration value="EVE"/&gt;
 *     &lt;enumeration value="FIX"/&gt;
 *     &lt;enumeration value="MPR"/&gt;
 *     &lt;enumeration value="NFF"/&gt;
 *     &lt;enumeration value="ONS"/&gt;
 *     &lt;enumeration value="PCR"/&gt;
 *     &lt;enumeration value="PDU"/&gt;
 *     &lt;enumeration value="PFP"/&gt;
 *     &lt;enumeration value="PPE"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="TIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeContentType")
@XmlEnum
public enum PaymentTypeContentType {

    CUR,
    DBD,
    EVE,
    FIX,
    MPR,
    NFF,
    ONS,
    PCR,
    PDU,
    PFP,
    PPE,
    SCH,
    TIN;

    public String value() {
        return name();
    }

    public static PaymentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
