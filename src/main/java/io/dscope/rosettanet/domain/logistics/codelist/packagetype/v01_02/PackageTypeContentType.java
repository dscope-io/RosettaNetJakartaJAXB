
package io.dscope.rosettanet.domain.logistics.codelist.packagetype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PackageTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BOX"/&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="MHC"/&gt;
 *     &lt;enumeration value="PLT"/&gt;
 *     &lt;enumeration value="PBG"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="REE"/&gt;
 *     &lt;enumeration value="TQF"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="TUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackageTypeContentType")
@XmlEnum
public enum PackageTypeContentType {

    BOX,
    CRT,
    MHC,
    PLT,
    PBG,
    PCC,
    REE,
    TQF,
    TRA,
    TUB;

    public String value() {
        return name();
    }

    public static PackageTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
