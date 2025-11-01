
package io.dscope.rosettanet.domain.shared.codelist.productstatuscode.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductStatusCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="ALO"/&gt;
 *     &lt;enumeration value="BOR"/&gt;
 *     &lt;enumeration value="DCN"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductStatusCodeContentType")
@XmlEnum
public enum ProductStatusCodeContentType {

    ACT,
    ALO,
    BOR,
    DCN,
    NPR,
    POS,
    REP;

    public String value() {
        return name();
    }

    public static ProductStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
