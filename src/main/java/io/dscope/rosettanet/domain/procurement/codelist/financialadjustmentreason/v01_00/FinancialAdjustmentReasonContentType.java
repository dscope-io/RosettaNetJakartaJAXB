
package io.dscope.rosettanet.domain.procurement.codelist.financialadjustmentreason.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAdjustmentReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FinancialAdjustmentReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FRE"/&gt;
 *     &lt;enumeration value="IPI"/&gt;
 *     &lt;enumeration value="IPR"/&gt;
 *     &lt;enumeration value="IQU"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="PPA"/&gt;
 *     &lt;enumeration value="RMA"/&gt;
 *     &lt;enumeration value="SAD"/&gt;
 *     &lt;enumeration value="SNR"/&gt;
 *     &lt;enumeration value="Tax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialAdjustmentReasonContentType")
@XmlEnum
public enum FinancialAdjustmentReasonContentType {

    FRE("FRE"),
    IPI("IPI"),
    IPR("IPR"),
    IQU("IQU"),
    IPO("IPO"),
    PPA("PPA"),
    RMA("RMA"),
    SAD("SAD"),
    SNR("SNR"),
    @XmlEnumValue("Tax")
    TAX("Tax");
    private final String value;

    FinancialAdjustmentReasonContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FinancialAdjustmentReasonContentType fromValue(String v) {
        for (FinancialAdjustmentReasonContentType c: FinancialAdjustmentReasonContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
