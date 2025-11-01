
package io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyProgramContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WarrantyProgramContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DMA"/&gt;
 *     &lt;enumeration value="SPW"/&gt;
 *     &lt;enumeration value="SWA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WarrantyProgramContentType")
@XmlEnum
public enum WarrantyProgramContentType {

    DMA,
    SPW,
    SWA;

    public String value() {
        return name();
    }

    public static WarrantyProgramContentType fromValue(String v) {
        return valueOf(v);
    }

}
