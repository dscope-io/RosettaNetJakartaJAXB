
package io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureActionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FailureActionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="NAC"/&gt;
 *     &lt;enumeration value="REA"/&gt;
 *     &lt;enumeration value="REL"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FailureActionContentType")
@XmlEnum
public enum FailureActionContentType {

    CON,
    NAC,
    REA,
    REL,
    RES,
    RET;

    public String value() {
        return name();
    }

    public static FailureActionContentType fromValue(String v) {
        return valueOf(v);
    }

}
