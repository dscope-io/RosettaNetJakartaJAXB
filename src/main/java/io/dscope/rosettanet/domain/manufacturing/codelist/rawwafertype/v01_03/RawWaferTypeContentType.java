
package io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RawWaferTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RawWaferTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EPI"/&gt;
 *     &lt;enumeration value="NEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RawWaferTypeContentType")
@XmlEnum
public enum RawWaferTypeContentType {

    EPI,
    NEP;

    public String value() {
        return name();
    }

    public static RawWaferTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
