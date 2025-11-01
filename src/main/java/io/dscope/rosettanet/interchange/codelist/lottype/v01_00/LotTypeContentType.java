
package io.dscope.rosettanet.interchange.codelist.lottype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LotTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotTypeContentType")
@XmlEnum
public enum LotTypeContentType {

    PRI,
    SEC;

    public String value() {
        return name();
    }

    public static LotTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
