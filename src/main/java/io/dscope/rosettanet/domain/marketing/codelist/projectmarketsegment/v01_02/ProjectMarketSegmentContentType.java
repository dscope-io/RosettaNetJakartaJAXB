
package io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectMarketSegmentContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProjectMarketSegmentContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="UCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProjectMarketSegmentContentType")
@XmlEnum
public enum ProjectMarketSegmentContentType {

    UCT;

    public String value() {
        return name();
    }

    public static ProjectMarketSegmentContentType fromValue(String v) {
        return valueOf(v);
    }

}
