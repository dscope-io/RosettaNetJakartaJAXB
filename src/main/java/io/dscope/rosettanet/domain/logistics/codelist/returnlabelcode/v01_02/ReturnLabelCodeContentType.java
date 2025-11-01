
package io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnLabelCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReturnLabelCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DFT"/&gt;
 *     &lt;enumeration value="DFR"/&gt;
 *     &lt;enumeration value="UNU"/&gt;
 *     &lt;enumeration value="UNR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReturnLabelCodeContentType")
@XmlEnum
public enum ReturnLabelCodeContentType {

    DFT,
    DFR,
    UNU,
    UNR;

    public String value() {
        return name();
    }

    public static ReturnLabelCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
