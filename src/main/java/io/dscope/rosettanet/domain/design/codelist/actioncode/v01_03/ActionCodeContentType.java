
package io.dscope.rosettanet.domain.design.codelist.actioncode.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ActionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHG"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *     &lt;enumeration value="UCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionCodeContentType")
@XmlEnum
public enum ActionCodeContentType {

    ADD,
    CHG,
    DEL,
    REQ,
    REV,
    UCH;

    public String value() {
        return name();
    }

    public static ActionCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
