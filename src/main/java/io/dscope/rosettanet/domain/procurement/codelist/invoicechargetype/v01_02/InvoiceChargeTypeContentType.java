
package io.dscope.rosettanet.domain.procurement.codelist.invoicechargetype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceChargeTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InvoiceChargeTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ALC"/&gt;
 *     &lt;enumeration value="CUC"/&gt;
 *     &lt;enumeration value="DEA"/&gt;
 *     &lt;enumeration value="FRC"/&gt;
 *     &lt;enumeration value="HAC"/&gt;
 *     &lt;enumeration value="QUD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceChargeTypeContentType")
@XmlEnum
public enum InvoiceChargeTypeContentType {

    ALC,
    CUC,
    DEA,
    FRC,
    HAC,
    QUD;

    public String value() {
        return name();
    }

    public static InvoiceChargeTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
