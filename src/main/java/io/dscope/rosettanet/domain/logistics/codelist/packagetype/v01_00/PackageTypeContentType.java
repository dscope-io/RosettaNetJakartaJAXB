
package io.dscope.rosettanet.domain.logistics.codelist.packagetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PackageTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MHC"/&gt;
 *     &lt;enumeration value="REE"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PBG"/&gt;
 *     &lt;enumeration value="PAL"/&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="BOX"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="TQF"/&gt;
 *     &lt;enumeration value="TUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackageTypeContentType")
@XmlEnum
public enum PackageTypeContentType {

    MHC,
    REE,
    PCC,
    PBG,
    PAL,
    CAT,
    BOX,
    TRA,
    TQF,
    TUB;

    public String value() {
        return name();
    }

    public static PackageTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
