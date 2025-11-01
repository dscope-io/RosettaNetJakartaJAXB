
package io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDocumentContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingDocumentContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BDE"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="EDE"/&gt;
 *     &lt;enumeration value="IDE"/&gt;
 *     &lt;enumeration value="PLI"/&gt;
 *     &lt;enumeration value="PFI"/&gt;
 *     &lt;enumeration value="SIN"/&gt;
 *     &lt;enumeration value="SIS"/&gt;
 *     &lt;enumeration value="SLO"/&gt;
 *     &lt;enumeration value="EXC"/&gt;
 *     &lt;enumeration value="LCS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentContentType")
@XmlEnum
public enum ShippingDocumentContentType {

    BOL,
    BDE,
    COO,
    CIN,
    EDE,
    IDE,
    PLI,
    PFI,
    SIN,
    SIS,
    SLO,
    EXC,
    LCS;

    public String value() {
        return name();
    }

    public static ShippingDocumentContentType fromValue(String v) {
        return valueOf(v);
    }

}
