
package io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QualityStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NMA"/&gt;
 *     &lt;enumeration value="NMI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityStatusContentType")
@XmlEnum
public enum QualityStatusContentType {

    NMA,
    NMI;

    public String value() {
        return name();
    }

    public static QualityStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
