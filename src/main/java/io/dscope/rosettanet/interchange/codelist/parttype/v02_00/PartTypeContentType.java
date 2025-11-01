
package io.dscope.rosettanet.interchange.codelist.parttype.v02_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PartTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="RAP"/&gt;
 *     &lt;enumeration value="RDT"/&gt;
 *     &lt;enumeration value="RKP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartTypeContentType")
@XmlEnum
public enum PartTypeContentType {

    RAP,
    RDT,
    RKP;

    public String value() {
        return name();
    }

    public static PartTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
