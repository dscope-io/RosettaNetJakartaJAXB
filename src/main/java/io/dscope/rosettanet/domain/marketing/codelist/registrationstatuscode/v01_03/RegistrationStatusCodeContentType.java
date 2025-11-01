
package io.dscope.rosettanet.domain.marketing.codelist.registrationstatuscode.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegistrationStatusCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="FRE"/&gt;
 *     &lt;enumeration value="OSW"/&gt;
 *     &lt;enumeration value="OWC"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="VAL"/&gt;
 *     &lt;enumeration value="WIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistrationStatusCodeContentType")
@XmlEnum
public enum RegistrationStatusCodeContentType {

    APP,
    CLO,
    DEN,
    EXP,
    FRE,
    OSW,
    OWC,
    PEN,
    PRO,
    VAL,
    WIN;

    public String value() {
        return name();
    }

    public static RegistrationStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
