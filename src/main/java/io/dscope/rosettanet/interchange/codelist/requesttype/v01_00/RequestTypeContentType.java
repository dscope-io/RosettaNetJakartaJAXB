
package io.dscope.rosettanet.interchange.codelist.requesttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CNP"/&gt;
 *     &lt;enumeration value="CNC"/&gt;
 *     &lt;enumeration value="CHB"/&gt;
 *     &lt;enumeration value="CHO"/&gt;
 *     &lt;enumeration value="CHA"/&gt;
 *     &lt;enumeration value="CHP"/&gt;
 *     &lt;enumeration value="CHD"/&gt;
 *     &lt;enumeration value="CHN"/&gt;
 *     &lt;enumeration value="MEG"/&gt;
 *     &lt;enumeration value="MOV"/&gt;
 *     &lt;enumeration value="QUE"/&gt;
 *     &lt;enumeration value="MNC"/&gt;
 *     &lt;enumeration value="QTR"/&gt;
 *     &lt;enumeration value="QST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeContentType")
@XmlEnum
public enum RequestTypeContentType {

    CNP,
    CNC,
    CHB,
    CHO,
    CHA,
    CHP,
    CHD,
    CHN,
    MEG,
    MOV,
    QUE,
    MNC,
    QTR,
    QST;

    public String value() {
        return name();
    }

    public static RequestTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
