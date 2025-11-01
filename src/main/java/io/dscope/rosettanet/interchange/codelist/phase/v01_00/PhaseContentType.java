
package io.dscope.rosettanet.interchange.codelist.phase.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhaseContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhaseContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="GAS"/&gt;
 *     &lt;enumeration value="LIQ"/&gt;
 *     &lt;enumeration value="SOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhaseContentType")
@XmlEnum
public enum PhaseContentType {

    GAS,
    LIQ,
    SOL;

    public String value() {
        return name();
    }

    public static PhaseContentType fromValue(String v) {
        return valueOf(v);
    }

}
