
package io.dscope.rosettanet.domain.procurement.codelist.paymenttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
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
 *     &lt;enumeration value="NO-"/&gt;
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

    CUR("CUR"),
    DBD("DBD"),
    EVE("EVE"),
    FIX("FIX"),
    MPR("MPR"),
    @XmlEnumValue("NO-")
    NO("NO-"),
    ONS("ONS"),
    PCR("PCR"),
    PDU("PDU"),
    PFP("PFP"),
    PPE("PPE"),
    SCH("SCH"),
    TIN("TIN");
    private final String value;

    PaymentTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeContentType fromValue(String v) {
        for (PaymentTypeContentType c: PaymentTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
