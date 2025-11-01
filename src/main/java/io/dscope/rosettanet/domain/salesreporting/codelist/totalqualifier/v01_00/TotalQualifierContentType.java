
package io.dscope.rosettanet.domain.salesreporting.codelist.totalqualifier.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalQualifierContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TotalQualifierContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SLU"/&gt;
 *     &lt;enumeration value="SLE"/&gt;
 *     &lt;enumeration value="SIU"/&gt;
 *     &lt;enumeration value="SIM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TotalQualifierContentType")
@XmlEnum
public enum TotalQualifierContentType {

    SLU,
    SLE,
    SIU,
    SIM;

    public String value() {
        return name();
    }

    public static TotalQualifierContentType fromValue(String v) {
        return valueOf(v);
    }

}
