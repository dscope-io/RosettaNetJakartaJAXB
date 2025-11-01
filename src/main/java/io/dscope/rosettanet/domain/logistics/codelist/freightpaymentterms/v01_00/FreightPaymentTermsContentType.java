
package io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightPaymentTermsContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightPaymentTermsContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACO"/&gt;
 *     &lt;enumeration value="APR"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="CFC"/&gt;
 *     &lt;enumeration value="CPI"/&gt;
 *     &lt;enumeration value="DBB"/&gt;
 *     &lt;enumeration value="FPO"/&gt;
 *     &lt;enumeration value="HPR"/&gt;
 *     &lt;enumeration value="MIX"/&gt;
 *     &lt;enumeration value="NRE"/&gt;
 *     &lt;enumeration value="PBB"/&gt;
 *     &lt;enumeration value="PBS"/&gt;
 *     &lt;enumeration value="PCO"/&gt;
 *     &lt;enumeration value="PIC"/&gt;
 *     &lt;enumeration value="P(S"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="PBC"/&gt;
 *     &lt;enumeration value="PBP"/&gt;
 *     &lt;enumeration value="PLC"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="RCF"/&gt;
 *     &lt;enumeration value="RCG"/&gt;
 *     &lt;enumeration value="RCH"/&gt;
 *     &lt;enumeration value="R1S"/&gt;
 *     &lt;enumeration value="SFN"/&gt;
 *     &lt;enumeration value="TPP"/&gt;
 *     &lt;enumeration value="WCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreightPaymentTermsContentType")
@XmlEnum
public enum FreightPaymentTermsContentType {

    ACO("ACO"),
    APR("APR"),
    COL("COL"),
    COD("COD"),
    CFC("CFC"),
    CPI("CPI"),
    DBB("DBB"),
    FPO("FPO"),
    HPR("HPR"),
    MIX("MIX"),
    NRE("NRE"),
    PBB("PBB"),
    PBS("PBS"),
    PCO("PCO"),
    PIC("PIC"),
    @XmlEnumValue("P(S")
    P_S("P(S"),
    PAS("PAS"),
    PBC("PBC"),
    PBP("PBP"),
    PLC("PLC"),
    PON("PON"),
    RCF("RCF"),
    RCG("RCG"),
    RCH("RCH"),
    @XmlEnumValue("R1S")
    R_1_S("R1S"),
    SFN("SFN"),
    TPP("TPP"),
    WCO("WCO");
    private final String value;

    FreightPaymentTermsContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FreightPaymentTermsContentType fromValue(String v) {
        for (FreightPaymentTermsContentType c: FreightPaymentTermsContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
