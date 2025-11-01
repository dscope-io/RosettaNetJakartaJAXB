
package io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProjectStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="PRP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProjectStatusContentType")
@XmlEnum
public enum ProjectStatusContentType {

    CON,
    DES,
    PRO,
    PRP;

    public String value() {
        return name();
    }

    public static ProjectStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
