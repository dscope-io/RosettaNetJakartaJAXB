
package io.dscope.rosettanet.domain.procurement.codelist.paymentcondition.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentConditionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentConditionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="REI"/&gt;
 *     &lt;enumeration value="SHI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentConditionContentType")
@XmlEnum
public enum PaymentConditionContentType {

    ACC,
    CON,
    REG,
    REI,
    SHI;

    public String value() {
        return name();
    }

    public static PaymentConditionContentType fromValue(String v) {
        return valueOf(v);
    }

}
