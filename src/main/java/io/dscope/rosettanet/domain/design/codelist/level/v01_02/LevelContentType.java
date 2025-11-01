
package io.dscope.rosettanet.domain.design.codelist.level.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LevelContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="NOM"/&gt;
 *     &lt;enumeration value="TYP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LevelContentType")
@XmlEnum
public enum LevelContentType {

    MAX,
    MIN,
    NOM,
    TYP;

    public String value() {
        return name();
    }

    public static LevelContentType fromValue(String v) {
        return valueOf(v);
    }

}
