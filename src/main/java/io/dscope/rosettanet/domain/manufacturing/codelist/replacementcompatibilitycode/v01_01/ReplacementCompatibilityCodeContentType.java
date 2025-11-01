
package io.dscope.rosettanet.domain.manufacturing.codelist.replacementcompatibilitycode.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplacementCompatibilityCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReplacementCompatibilityCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DDD"/&gt;
 *     &lt;enumeration value="DDF"/&gt;
 *     &lt;enumeration value="DFD"/&gt;
 *     &lt;enumeration value="DFF"/&gt;
 *     &lt;enumeration value="DFN"/&gt;
 *     &lt;enumeration value="DFP"/&gt;
 *     &lt;enumeration value="DSD"/&gt;
 *     &lt;enumeration value="DSF"/&gt;
 *     &lt;enumeration value="DTD"/&gt;
 *     &lt;enumeration value="DTF"/&gt;
 *     &lt;enumeration value="SCN"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="SDC"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="SDO"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SDT"/&gt;
 *     &lt;enumeration value="SFD"/&gt;
 *     &lt;enumeration value="SFF"/&gt;
 *     &lt;enumeration value="SFN"/&gt;
 *     &lt;enumeration value="SFP"/&gt;
 *     &lt;enumeration value="SON"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReplacementCompatibilityCodeContentType")
@XmlEnum
public enum ReplacementCompatibilityCodeContentType {

    DDD,
    DDF,
    DFD,
    DFF,
    DFN,
    DFP,
    DSD,
    DSF,
    DTD,
    DTF,
    SCN,
    SCP,
    SDC,
    SDN,
    SDO,
    SDP,
    SDT,
    SFD,
    SFF,
    SFN,
    SFP,
    SON,
    STD,
    STN;

    public String value() {
        return name();
    }

    public static ReplacementCompatibilityCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
