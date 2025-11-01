
package io.dscope.rosettanet.interchange.codelist.stockindicator.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockIndicatorContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StockIndicatorContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="FAC"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StockIndicatorContentType")
@XmlEnum
public enum StockIndicatorContentType {

    DIS,
    FAC,
    NON,
    PAR;

    public String value() {
        return name();
    }

    public static StockIndicatorContentType fromValue(String v) {
        return valueOf(v);
    }

}
