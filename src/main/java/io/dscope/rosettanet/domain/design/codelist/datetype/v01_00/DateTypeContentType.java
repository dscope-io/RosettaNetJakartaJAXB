
package io.dscope.rosettanet.domain.design.codelist.datetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DateTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ELD"/&gt;
 *     &lt;enumeration value="FSD"/&gt;
 *     &lt;enumeration value="LDO"/&gt;
 *     &lt;enumeration value="LDS"/&gt;
 *     &lt;enumeration value="LMD"/&gt;
 *     &lt;enumeration value="QAD"/&gt;
 *     &lt;enumeration value="RRD"/&gt;
 *     &lt;enumeration value="SAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTypeContentType")
@XmlEnum
public enum DateTypeContentType {

    ELD,
    FSD,
    LDO,
    LDS,
    LMD,
    QAD,
    RRD,
    SAD;

    public String value() {
        return name();
    }

    public static DateTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
