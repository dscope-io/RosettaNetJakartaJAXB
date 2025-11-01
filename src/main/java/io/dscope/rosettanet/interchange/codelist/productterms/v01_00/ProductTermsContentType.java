
package io.dscope.rosettanet.interchange.codelist.productterms.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductTermsContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductTermsContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EOL"/&gt;
 *     &lt;enumeration value="NOC"/&gt;
 *     &lt;enumeration value="OTB"/&gt;
 *     &lt;enumeration value="PPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductTermsContentType")
@XmlEnum
public enum ProductTermsContentType {

    EOL,
    NOC,
    OTB,
    PPR;

    public String value() {
        return name();
    }

    public static ProductTermsContentType fromValue(String v) {
        return valueOf(v);
    }

}
