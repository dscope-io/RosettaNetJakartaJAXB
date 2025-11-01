
package io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ActionTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CRA"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="RAC"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionTypeContentType")
@XmlEnum
public enum ActionTypeContentType {

    ADD,
    CRA,
    DEL,
    RAC,
    REV;

    public String value() {
        return name();
    }

    public static ActionTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
