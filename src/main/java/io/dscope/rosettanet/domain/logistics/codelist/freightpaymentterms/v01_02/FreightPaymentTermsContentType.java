
package io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightPaymentTermsContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreightPaymentTermsContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADC"/&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="COF"/&gt;
 *     &lt;enumeration value="CPI"/&gt;
 *     &lt;enumeration value="DBS"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="HPR"/&gt;
 *     &lt;enumeration value="MIX"/&gt;
 *     &lt;enumeration value="NRE"/&gt;
 *     &lt;enumeration value="PBB"/&gt;
 *     &lt;enumeration value="PBS"/&gt;
 *     &lt;enumeration value="PCO"/&gt;
 *     &lt;enumeration value="PIC"/&gt;
 *     &lt;enumeration value="PPS"/&gt;
 *     &lt;enumeration value="PPY"/&gt;
 *     &lt;enumeration value="PPC"/&gt;
 *     &lt;enumeration value="PPP"/&gt;
 *     &lt;enumeration value="PPL"/&gt;
 *     &lt;enumeration value="PPO"/&gt;
 *     &lt;enumeration value="RCF"/&gt;
 *     &lt;enumeration value="RCG"/&gt;
 *     &lt;enumeration value="RCH"/&gt;
 *     &lt;enumeration value="RUL"/&gt;
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

    ADC,
    ADP,
    COL,
    COD,
    COF,
    CPI,
    DBS,
    FOB,
    HPR,
    MIX,
    NRE,
    PBB,
    PBS,
    PCO,
    PIC,
    PPS,
    PPY,
    PPC,
    PPP,
    PPL,
    PPO,
    RCF,
    RCG,
    RCH,
    RUL,
    SFN,
    TPP,
    WCO;

    public String value() {
        return name();
    }

    public static FreightPaymentTermsContentType fromValue(String v) {
        return valueOf(v);
    }

}
