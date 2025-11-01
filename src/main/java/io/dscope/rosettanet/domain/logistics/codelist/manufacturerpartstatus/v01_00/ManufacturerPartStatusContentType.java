
package io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManufacturerPartStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ManufacturerPartStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DQA"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="OBS"/&gt;
 *     &lt;enumeration value="QAH"/&gt;
 *     &lt;enumeration value="REF"/&gt;
 *     &lt;enumeration value="UNQ"/&gt;
 *     &lt;enumeration value="UQA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManufacturerPartStatusContentType")
@XmlEnum
public enum ManufacturerPartStatusContentType {

    APP,
    CON,
    DQA,
    NPR,
    OBS,
    QAH,
    REF,
    UNQ,
    UQA;

    public String value() {
        return name();
    }

    public static ManufacturerPartStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
