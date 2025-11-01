
package io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteLocationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RouteLocationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACL"/&gt;
 *     &lt;enumeration value="BLO"/&gt;
 *     &lt;enumeration value="BWH"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="DCP"/&gt;
 *     &lt;enumeration value="DFW"/&gt;
 *     &lt;enumeration value="DFZ"/&gt;
 *     &lt;enumeration value="EXM"/&gt;
 *     &lt;enumeration value="FID"/&gt;
 *     &lt;enumeration value="FPD"/&gt;
 *     &lt;enumeration value="INP"/&gt;
 *     &lt;enumeration value="LGC"/&gt;
 *     &lt;enumeration value="NDF"/&gt;
 *     &lt;enumeration value="PDC"/&gt;
 *     &lt;enumeration value="PDE"/&gt;
 *     &lt;enumeration value="POC"/&gt;
 *     &lt;enumeration value="POE"/&gt;
 *     &lt;enumeration value="POH"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="RCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteLocationContentType")
@XmlEnum
public enum RouteLocationContentType {

    ACL,
    BLO,
    BWH,
    COM,
    COO,
    COP,
    DCP,
    DFW,
    DFZ,
    EXM,
    FID,
    FPD,
    INP,
    LGC,
    NDF,
    PDC,
    PDE,
    POC,
    POE,
    POH,
    POI,
    POL,
    PON,
    POO,
    POR,
    RCP;

    public String value() {
        return name();
    }

    public static RouteLocationContentType fromValue(String v) {
        return valueOf(v);
    }

}
