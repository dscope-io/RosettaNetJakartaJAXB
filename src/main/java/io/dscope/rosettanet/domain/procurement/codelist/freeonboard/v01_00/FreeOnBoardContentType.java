
package io.dscope.rosettanet.domain.procurement.codelist.freeonboard.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeOnBoardContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FreeOnBoardContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="ORG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreeOnBoardContentType")
@XmlEnum
public enum FreeOnBoardContentType {

    DES,
    ORG;

    public String value() {
        return name();
    }

    public static FreeOnBoardContentType fromValue(String v) {
        return valueOf(v);
    }

}
