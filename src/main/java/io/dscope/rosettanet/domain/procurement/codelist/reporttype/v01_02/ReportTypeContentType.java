
package io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReportTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="SLT"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportTypeContentType")
@XmlEnum
public enum ReportTypeContentType {

    CON,
    SLT,
    STR;

    public String value() {
        return name();
    }

    public static ReportTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
