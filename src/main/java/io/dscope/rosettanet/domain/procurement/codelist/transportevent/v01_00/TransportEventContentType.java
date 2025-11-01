
package io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportEventContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransportEventContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="PIC"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportEventContentType")
@XmlEnum
public enum TransportEventContentType {

    DOC,
    PIC,
    SHP;

    public String value() {
        return name();
    }

    public static TransportEventContentType fromValue(String v) {
        return valueOf(v);
    }

}
