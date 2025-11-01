
package io.dscope.rosettanet.domain.logistics.codelist.packagetype.v01_04;

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
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="LPK"/&gt;
 *     &lt;enumeration value="MHC"/&gt;
 *     &lt;enumeration value="MIX"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PAC"/&gt;
 *     &lt;enumeration value="PBG"/&gt;
 *     &lt;enumeration value="PBX"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PLT"/&gt;
 *     &lt;enumeration value="REE"/&gt;
 *     &lt;enumeration value="TQF"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="TUB"/&gt;
 *     &lt;enumeration value="WDC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PackageTypeContentType")
@XmlEnum
public enum PackageTypeContentType {

    BOX,
    BRL,
    CRT,
    LPK,
    MHC,
    MIX,
    OTH,
    PAC,
    PBG,
    PBX,
    PCC,
    PLT,
    REE,
    TQF,
    TRA,
    TUB,
    WDC;

    public String value() {
        return name();
    }

    public static PackageTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
