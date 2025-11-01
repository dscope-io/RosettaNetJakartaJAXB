
package io.dscope.rosettanet.domain.service.codelist.severity.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SeverityContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRI"/&gt;
 *     &lt;enumeration value="MAJ"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="NOI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityContentType")
@XmlEnum
public enum SeverityContentType {

    CRI,
    MAJ,
    MED,
    MIN,
    NOI;

    public String value() {
        return name();
    }

    public static SeverityContentType fromValue(String v) {
        return valueOf(v);
    }

}
