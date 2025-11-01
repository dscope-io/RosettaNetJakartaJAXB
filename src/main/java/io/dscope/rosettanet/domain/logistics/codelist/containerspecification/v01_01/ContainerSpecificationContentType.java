
package io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerSpecificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContainerSpecificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="LNG"/&gt;
 *     &lt;enumeration value="SHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContainerSpecificationContentType")
@XmlEnum
public enum ContainerSpecificationContentType {

    LNG,
    SHT;

    public String value() {
        return name();
    }

    public static ContainerSpecificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
