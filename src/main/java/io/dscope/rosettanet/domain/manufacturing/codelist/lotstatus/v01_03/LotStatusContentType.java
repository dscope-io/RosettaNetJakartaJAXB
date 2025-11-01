
package io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LotStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BAN"/&gt;
 *     &lt;enumeration value="HOL"/&gt;
 *     &lt;enumeration value="INQ"/&gt;
 *     &lt;enumeration value="RUN"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SHI"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="WIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotStatusContentType")
@XmlEnum
public enum LotStatusContentType {

    BAN,
    HOL,
    INQ,
    RUN,
    SCH,
    SCR,
    SHI,
    TRA,
    WIP;

    public String value() {
        return name();
    }

    public static LotStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
