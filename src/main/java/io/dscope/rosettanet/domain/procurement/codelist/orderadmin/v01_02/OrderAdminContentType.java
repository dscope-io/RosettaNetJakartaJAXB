
package io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
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
 *     &lt;enumeration value="ERA"/&gt;
 *     &lt;enumeration value="GRA"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="MUL"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RZC"/&gt;
 *     &lt;enumeration value="SAM"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="TIO"/&gt;
 *     &lt;enumeration value="TIR"/&gt;
 *     &lt;enumeration value="UPG"/&gt;
 *     &lt;enumeration value="UZC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderAdminContentType")
@XmlEnum
public enum OrderAdminContentType {

    DDE,
    DOA,
    ERA,
    GRA,
    INT,
    MUL,
    PRE,
    REP,
    RZC,
    SAM,
    SPR,
    STA,
    TIO,
    TIR,
    UPG,
    UZC;

    public String value() {
        return name();
    }

    public static OrderAdminContentType fromValue(String v) {
        return valueOf(v);
    }

}
