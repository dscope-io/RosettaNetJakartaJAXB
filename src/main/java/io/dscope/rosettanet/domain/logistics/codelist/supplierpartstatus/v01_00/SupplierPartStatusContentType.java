
package io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierPartStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupplierPartStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ABO"/&gt;
 *     &lt;enumeration value="AIS"/&gt;
 *     &lt;enumeration value="ALC"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplierPartStatusContentType")
@XmlEnum
public enum SupplierPartStatusContentType {

    ABO,
    AIS,
    ALC,
    CON,
    NPR,
    PRE;

    public String value() {
        return name();
    }

    public static SupplierPartStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
