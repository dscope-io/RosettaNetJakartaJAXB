
package io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CatalogTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="WHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CatalogTypeContentType")
@XmlEnum
public enum CatalogTypeContentType {

    PAR,
    WHO;

    public String value() {
        return name();
    }

    public static CatalogTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
