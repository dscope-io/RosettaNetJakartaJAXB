
package io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncotermsContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IncotermsContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncotermsContentType")
@XmlEnum
public enum IncotermsContentType {

    DAF,
    CPT,
    CIP,
    CIF,
    CFR,
    DEQ,
    DDU,
    DDP,
    FAS,
    EXW,
    DES,
    FCA,
    FOB;

    public String value() {
        return name();
    }

    public static IncotermsContentType fromValue(String v) {
        return valueOf(v);
    }

}
