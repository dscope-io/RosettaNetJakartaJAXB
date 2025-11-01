
package io.dscope.rosettanet.domain.procurement.codelist.documenttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRM"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="INV"/&gt;
 *     &lt;enumeration value="SBC"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SBI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeContentType")
@XmlEnum
public enum DocumentTypeContentType {

    CRM,
    DEM,
    INV,
    SBC,
    SBD,
    SBI;

    public String value() {
        return name();
    }

    public static DocumentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
