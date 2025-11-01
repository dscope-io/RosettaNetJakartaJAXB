
package io.dscope.rosettanet.domain.procurement.codelist.yesno.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNoContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="YesNoContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="YES"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YesNoContentType")
@XmlEnum
public enum YesNoContentType {

    YES,
    NO;

    public String value() {
        return name();
    }

    public static YesNoContentType fromValue(String v) {
        return valueOf(v);
    }

}
