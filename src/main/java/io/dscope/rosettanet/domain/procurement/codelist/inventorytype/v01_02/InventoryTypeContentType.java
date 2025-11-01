
package io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InventoryTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AVI"/&gt;
 *     &lt;enumeration value="COI"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="CQC"/&gt;
 *     &lt;enumeration value="CQR"/&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="FIG"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="ITB"/&gt;
 *     &lt;enumeration value="ITW"/&gt;
 *     &lt;enumeration value="MDS"/&gt;
 *     &lt;enumeration value="MDT"/&gt;
 *     &lt;enumeration value="MII"/&gt;
 *     &lt;enumeration value="MIT"/&gt;
 *     &lt;enumeration value="NAI"/&gt;
 *     &lt;enumeration value="NSA"/&gt;
 *     &lt;enumeration value="OHI"/&gt;
 *     &lt;enumeration value="ONH"/&gt;
 *     &lt;enumeration value="OPB"/&gt;
 *     &lt;enumeration value="PDD"/&gt;
 *     &lt;enumeration value="QUA"/&gt;
 *     &lt;enumeration value="RAW"/&gt;
 *     &lt;enumeration value="WPI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryTypeContentType")
@XmlEnum
public enum InventoryTypeContentType {

    AVI,
    COI,
    COM,
    CQC,
    CQR,
    DEF,
    FIG,
    INT,
    ITB,
    ITW,
    MDS,
    MDT,
    MII,
    MIT,
    NAI,
    NSA,
    OHI,
    ONH,
    OPB,
    PDD,
    QUA,
    RAW,
    WPI;

    public String value() {
        return name();
    }

    public static InventoryTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
