
package io.dscope.rosettanet.domain.design.codelist.level.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LevelContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="AVG"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="GRT"/&gt;
 *     &lt;enumeration value="LST"/&gt;
 *     &lt;enumeration value="MAV"/&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="NOM"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="TYP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LevelContentType")
@XmlEnum
public enum LevelContentType {

    ACT,
    AVG,
    CON,
    EXP,
    GRT,
    LST,
    MAV,
    MAX,
    MDL,
    MIN,
    NOM,
    STD,
    TYP;

    public String value() {
        return name();
    }

    public static LevelContentType fromValue(String v) {
        return valueOf(v);
    }

}
