
package io.dscope.rosettanet.domain.logistics.codelist.partstatus.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PartStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACQ"/&gt;
 *     &lt;enumeration value="ABO"/&gt;
 *     &lt;enumeration value="AIS"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="OBS"/&gt;
 *     &lt;enumeration value="QHO"/&gt;
 *     &lt;enumeration value="REF"/&gt;
 *     &lt;enumeration value="UQU"/&gt;
 *     &lt;enumeration value="UNQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartStatusContentType")
@XmlEnum
public enum PartStatusContentType {

    ACQ,
    ABO,
    AIS,
    ALL,
    APP,
    CON,
    COO,
    DIS,
    NON,
    OBS,
    QHO,
    REF,
    UQU,
    UNQ;

    public String value() {
        return name();
    }

    public static PartStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
