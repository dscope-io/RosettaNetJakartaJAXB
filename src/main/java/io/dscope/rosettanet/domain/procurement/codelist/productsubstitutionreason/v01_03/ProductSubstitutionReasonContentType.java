
package io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSubstitutionReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductSubstitutionReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BEP"/&gt;
 *     &lt;enumeration value="CMP"/&gt;
 *     &lt;enumeration value="DWN"/&gt;
 *     &lt;enumeration value="IPN"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="QRH"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RPL"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductSubstitutionReasonContentType")
@XmlEnum
public enum ProductSubstitutionReasonContentType {

    BEP,
    CMP,
    DWN,
    IPN,
    PRE,
    QRH,
    REP,
    RPL,
    SCC;

    public String value() {
        return name();
    }

    public static ProductSubstitutionReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
