
package io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PreferredStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ALT"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="EOL"/&gt;
 *     &lt;enumeration value="UQA"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PLA"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="SLT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferredStatusContentType")
@XmlEnum
public enum PreferredStatusContentType {

    ALT,
    DIS,
    EOL,
    UQA,
    NAV,
    OTH,
    PLA,
    PRI,
    SLT;

    public String value() {
        return name();
    }

    public static PreferredStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
