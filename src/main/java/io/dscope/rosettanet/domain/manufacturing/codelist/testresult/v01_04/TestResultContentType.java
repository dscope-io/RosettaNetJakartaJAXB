
package io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TestResultContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FAL"/&gt;
 *     &lt;enumeration value="FCS"/&gt;
 *     &lt;enumeration value="FHL"/&gt;
 *     &lt;enumeration value="FLL"/&gt;
 *     &lt;enumeration value="PAS"/&gt;
 *     &lt;enumeration value="SCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TestResultContentType")
@XmlEnum
public enum TestResultContentType {

    FAL,
    FCS,
    FHL,
    FLL,
    PAS,
    SCV;

    public String value() {
        return name();
    }

    public static TestResultContentType fromValue(String v) {
        return valueOf(v);
    }

}
