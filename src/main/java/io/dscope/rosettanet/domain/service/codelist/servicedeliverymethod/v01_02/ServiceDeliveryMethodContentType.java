
package io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDeliveryMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceDeliveryMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AON"/&gt;
 *     &lt;enumeration value="CAR"/&gt;
 *     &lt;enumeration value="FAC"/&gt;
 *     &lt;enumeration value="FUP"/&gt;
 *     &lt;enumeration value="ONS"/&gt;
 *     &lt;enumeration value="PFI"/&gt;
 *     &lt;enumeration value="TCO"/&gt;
 *     &lt;enumeration value="URP"/&gt;
 *     &lt;enumeration value="URQ"/&gt;
 *     &lt;enumeration value="URR"/&gt;
 *     &lt;enumeration value="URS"/&gt;
 *     &lt;enumeration value="URT"/&gt;
 *     &lt;enumeration value="URU"/&gt;
 *     &lt;enumeration value="URV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceDeliveryMethodContentType")
@XmlEnum
public enum ServiceDeliveryMethodContentType {

    AON,
    CAR,
    FAC,
    FUP,
    ONS,
    PFI,
    TCO,
    URP,
    URQ,
    URR,
    URS,
    URT,
    URU,
    URV;

    public String value() {
        return name();
    }

    public static ServiceDeliveryMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
