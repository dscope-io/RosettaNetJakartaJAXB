
package io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTransmissionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FileTransmissionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="TRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileTransmissionContentType")
@XmlEnum
public enum FileTransmissionContentType {

    CON,
    TRE;

    public String value() {
        return name();
    }

    public static FileTransmissionContentType fromValue(String v) {
        return valueOf(v);
    }

}
