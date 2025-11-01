
package io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignWinClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DesignWinClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DIN"/&gt;
 *     &lt;enumeration value="DWI"/&gt;
 *     &lt;enumeration value="PWI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DesignWinClassificationContentType")
@XmlEnum
public enum DesignWinClassificationContentType {

    DIN,
    DWI,
    PWI;

    public String value() {
        return name();
    }

    public static DesignWinClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
