
package io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryOwnershipContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InventoryOwnershipContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CSS"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PJS"/&gt;
 *     &lt;enumeration value="RPS"/&gt;
 *     &lt;enumeration value="RTP"/&gt;
 *     &lt;enumeration value="SMV"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="VCS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryOwnershipContentType")
@XmlEnum
public enum InventoryOwnershipContentType {

    CSS,
    OTH,
    PJS,
    RPS,
    RTP,
    SMV,
    SOS,
    VCS;

    public String value() {
        return name();
    }

    public static InventoryOwnershipContentType fromValue(String v) {
        return valueOf(v);
    }

}
