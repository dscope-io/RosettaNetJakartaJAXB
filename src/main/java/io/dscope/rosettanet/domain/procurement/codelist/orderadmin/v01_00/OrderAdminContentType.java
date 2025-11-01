
package io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderAdminContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrderAdminContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DDE"/&gt;
 *     &lt;enumeration value="DOA"/&gt;
 *     &lt;enumeration value="E-R"/&gt;
 *     &lt;enumeration value="GRA"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="MUL"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="R-Z"/&gt;
 *     &lt;enumeration value="SAM"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="TOR"/&gt;
 *     &lt;enumeration value="TRE"/&gt;
 *     &lt;enumeration value="UPG"/&gt;
 *     &lt;enumeration value="U-Z"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderAdminContentType")
@XmlEnum
public enum OrderAdminContentType {

    DDE("DDE"),
    DOA("DOA"),
    @XmlEnumValue("E-R")
    E_R("E-R"),
    GRA("GRA"),
    INT("INT"),
    MUL("MUL"),
    PRE("PRE"),
    REP("REP"),
    @XmlEnumValue("R-Z")
    R_Z("R-Z"),
    SAM("SAM"),
    SPR("SPR"),
    STA("STA"),
    TOR("TOR"),
    TRE("TRE"),
    UPG("UPG"),
    @XmlEnumValue("U-Z")
    U_Z("U-Z");
    private final String value;

    OrderAdminContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderAdminContentType fromValue(String v) {
        for (OrderAdminContentType c: OrderAdminContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
