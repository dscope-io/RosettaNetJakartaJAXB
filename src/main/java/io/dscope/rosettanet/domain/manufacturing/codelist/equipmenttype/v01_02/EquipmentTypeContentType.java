
package io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EquipmentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BAC"/&gt;
 *     &lt;enumeration value="CLE"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="DIF"/&gt;
 *     &lt;enumeration value="ETC"/&gt;
 *     &lt;enumeration value="ETE"/&gt;
 *     &lt;enumeration value="FSO"/&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="MAP"/&gt;
 *     &lt;enumeration value="MOL"/&gt;
 *     &lt;enumeration value="OQA"/&gt;
 *     &lt;enumeration value="PHO"/&gt;
 *     &lt;enumeration value="TAF"/&gt;
 *     &lt;enumeration value="WBO"/&gt;
 *     &lt;enumeration value="WSA"/&gt;
 *     &lt;enumeration value="WSO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentTypeContentType")
@XmlEnum
public enum EquipmentTypeContentType {

    BAC,
    CLE,
    DAT,
    DIF,
    ETC,
    ETE,
    FSO,
    IMP,
    MAP,
    MOL,
    OQA,
    PHO,
    TAF,
    WBO,
    WSA,
    WSO;

    public String value() {
        return name();
    }

    public static EquipmentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
