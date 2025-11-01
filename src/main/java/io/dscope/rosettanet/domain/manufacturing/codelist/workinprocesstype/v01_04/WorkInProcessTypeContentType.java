
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkInProcessTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WorkInProcessTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BON"/&gt;
 *     &lt;enumeration value="CIT"/&gt;
 *     &lt;enumeration value="CLN"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="CQU"/&gt;
 *     &lt;enumeration value="FAB"/&gt;
 *     &lt;enumeration value="HOL"/&gt;
 *     &lt;enumeration value="LOT"/&gt;
 *     &lt;enumeration value="MER"/&gt;
 *     &lt;enumeration value="MOV"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="REL"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SHI"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="STB"/&gt;
 *     &lt;enumeration value="TER"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="UNC"/&gt;
 *     &lt;enumeration value="UNL"/&gt;
 *     &lt;enumeration value="UNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkInProcessTypeContentType")
@XmlEnum
public enum WorkInProcessTypeContentType {

    BON,
    CIT,
    CLN,
    COM,
    CON,
    CQU,
    FAB,
    HOL,
    LOT,
    MER,
    MOV,
    REC,
    REJ,
    REL,
    SCH,
    SCR,
    SHI,
    SPL,
    STA,
    STB,
    TER,
    TRA,
    UNC,
    UNL,
    UNS;

    public String value() {
        return name();
    }

    public static WorkInProcessTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
