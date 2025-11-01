
package io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSubstitutionReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductSubstitutionReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BEP"/&gt;
 *     &lt;enumeration value="IPN"/&gt;
 *     &lt;enumeration value="QRH"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="CMP{new}"/&gt;
 *     &lt;enumeration value="DWN{new}"/&gt;
 *     &lt;enumeration value="PRE{new}"/&gt;
 *     &lt;enumeration value="RPL{new}"/&gt;
 *     &lt;enumeration value="SCC{new}"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductSubstitutionReasonContentType")
@XmlEnum
public enum ProductSubstitutionReasonContentType {

    BEP("BEP"),
    IPN("IPN"),
    QRH("QRH"),
    REP("REP"),
    @XmlEnumValue("CMP{new}")
    CMP_NEW("CMP{new}"),
    @XmlEnumValue("DWN{new}")
    DWN_NEW("DWN{new}"),
    @XmlEnumValue("PRE{new}")
    PRE_NEW("PRE{new}"),
    @XmlEnumValue("RPL{new}")
    RPL_NEW("RPL{new}"),
    @XmlEnumValue("SCC{new}")
    SCC_NEW("SCC{new}");
    private final String value;

    ProductSubstitutionReasonContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSubstitutionReasonContentType fromValue(String v) {
        for (ProductSubstitutionReasonContentType c: ProductSubstitutionReasonContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
