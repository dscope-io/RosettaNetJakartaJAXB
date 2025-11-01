
package io.dscope.rosettanet.domain.service.codelist.failuretype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FailureTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PFA"/&gt;
 *     &lt;enumeration value="PHO"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PSC"/&gt;
 *     &lt;enumeration value="SFA"/&gt;
 *     &lt;enumeration value="SHO"/&gt;
 *     &lt;enumeration value="SRE"/&gt;
 *     &lt;enumeration value="SRC"/&gt;
 *     &lt;enumeration value="SSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureTypeContentType")
@XmlEnum
public enum FailureTypeContentType {

    PFA,
    PHO,
    PRE,
    PRC,
    PSC,
    SFA,
    SHO,
    SRE,
    SRC,
    SSC;

    public String value() {
        return name();
    }

    public static FailureTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
