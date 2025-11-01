
package io.dscope.rosettanet.domain.service.codelist.warrantymethod.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WarrantyMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MDA"/&gt;
 *     &lt;enumeration value="SND"/&gt;
 *     &lt;enumeration value="SPE"/&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WarrantyMethodContentType")
@XmlEnum
public enum WarrantyMethodContentType {

    MDA,
    SND,
    SPE,
    UNK;

    public String value() {
        return name();
    }

    public static WarrantyMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
