
package io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuoteTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BFB"/&gt;
 *     &lt;enumeration value="BFC"/&gt;
 *     &lt;enumeration value="BQU"/&gt;
 *     &lt;enumeration value="BQV"/&gt;
 *     &lt;enumeration value="BQW"/&gt;
 *     &lt;enumeration value="CQU"/&gt;
 *     &lt;enumeration value="CQV"/&gt;
 *     &lt;enumeration value="QWR"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="REW"/&gt;
 *     &lt;enumeration value="RFB"/&gt;
 *     &lt;enumeration value="SER"/&gt;
 *     &lt;enumeration value="SFS"/&gt;
 *     &lt;enumeration value="REN"/&gt;
 *     &lt;enumeration value="UPG"/&gt;
 *     &lt;enumeration value="DWG"/&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHG"/&gt;
 *     &lt;enumeration value="NCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteTypeContentType")
@XmlEnum
public enum QuoteTypeContentType {

    BFB,
    BFC,
    BQU,
    BQV,
    BQW,
    CQU,
    CQV,
    QWR,
    REP,
    REW,
    RFB,
    SER,
    SFS,
    REN,
    UPG,
    DWG,
    ADD,
    CHG,
    NCO;

    public String value() {
        return name();
    }

    public static QuoteTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
