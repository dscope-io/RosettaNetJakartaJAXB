
package io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="EDI"/&gt;
 *     &lt;enumeration value="EML"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="MAL"/&gt;
 *     &lt;enumeration value="ONL"/&gt;
 *     &lt;enumeration value="PHN"/&gt;
 *     &lt;enumeration value="ROS"/&gt;
 *     &lt;enumeration value="WRD"/&gt;
 *     &lt;enumeration value="WSV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseMethodContentType")
@XmlEnum
public enum PurchaseMethodContentType {

    CAT,
    EDI,
    EML,
    FAX,
    MAL,
    ONL,
    PHN,
    ROS,
    WRD,
    WSV;

    public String value() {
        return name();
    }

    public static PurchaseMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
