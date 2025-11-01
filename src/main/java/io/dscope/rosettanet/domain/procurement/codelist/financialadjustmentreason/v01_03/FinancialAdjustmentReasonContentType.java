
package io.dscope.rosettanet.domain.procurement.codelist.financialadjustmentreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAdjustmentReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FinancialAdjustmentReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CBB"/&gt;
 *     &lt;enumeration value="FRE"/&gt;
 *     &lt;enumeration value="IPI"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="IPR"/&gt;
 *     &lt;enumeration value="IQU"/&gt;
 *     &lt;enumeration value="PPA"/&gt;
 *     &lt;enumeration value="RMA"/&gt;
 *     &lt;enumeration value="SAD"/&gt;
 *     &lt;enumeration value="SNR"/&gt;
 *     &lt;enumeration value="TAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialAdjustmentReasonContentType")
@XmlEnum
public enum FinancialAdjustmentReasonContentType {

    CBB,
    FRE,
    IPI,
    IPO,
    IPR,
    IQU,
    PPA,
    RMA,
    SAD,
    SNR,
    TAX;

    public String value() {
        return name();
    }

    public static FinancialAdjustmentReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
