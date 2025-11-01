
package io.dscope.rosettanet.domain.manufacturing.codelist.axis.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxisContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AxisContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AxisContentType")
@XmlEnum
public enum AxisContentType {

    X,
    Y,
    Z;

    public String value() {
        return name();
    }

    public static AxisContentType fromValue(String v) {
        return valueOf(v);
    }

}
