
package io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="EDI"/&gt;
 *     &lt;enumeration value="ROS"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="PHN"/&gt;
 *     &lt;enumeration value="WSV"/&gt;
 *     &lt;enumeration value="EML"/&gt;
 *     &lt;enumeration value="WRD"/&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="MAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseMethodContentType")
@XmlEnum
public enum PurchaseMethodContentType {

    INT,
    EDI,
    ROS,
    FAX,
    PHN,
    WSV,
    EML,
    WRD,
    CAT,
    MAL;

    public String value() {
        return name();
    }

    public static PurchaseMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
