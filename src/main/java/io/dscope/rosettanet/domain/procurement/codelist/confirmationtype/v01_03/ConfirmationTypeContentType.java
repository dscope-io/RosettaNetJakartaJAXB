
package io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfirmationTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AMC"/&gt;
 *     &lt;enumeration value="ANC"/&gt;
 *     &lt;enumeration value="APC"/&gt;
 *     &lt;enumeration value="APS"/&gt;
 *     &lt;enumeration value="ASC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfirmationTypeContentType")
@XmlEnum
public enum ConfirmationTypeContentType {

    AMC,
    ANC,
    APC,
    APS,
    ASC;

    public String value() {
        return name();
    }

    public static ConfirmationTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
