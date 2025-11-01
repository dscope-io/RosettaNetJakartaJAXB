
package io.dscope.rosettanet.universal.datatype.v01_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.datatype.v01_02 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.datatype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contact }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Contact }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "Contact")
    public Contact createContact(String value) {
        return new Contact(value);
    }

    /**
     * Create an instance of {@link DUNS }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DUNS }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "DUNS")
    public DUNS createDUNS(String value) {
        return new DUNS(value);
    }

    /**
     * Create an instance of {@link DUNSPlus4 }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DUNSPlus4 }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "DUNSPlus4")
    public DUNSPlus4 createDUNSPlus4(String value) {
        return new DUNSPlus4(value);
    }

    /**
     * Create an instance of {@link GLN }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GLN }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "GLN")
    public GLN createGLN(String value) {
        return new GLN(value);
    }

    /**
     * Create an instance of {@link GTIN }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GTIN }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "GTIN")
    public GTIN createGTIN(String value) {
        return new GTIN(value);
    }

    /**
     * Create an instance of {@link Hexadecimal }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Hexadecimal }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "Hexadecimal")
    public Hexadecimal createHexadecimal(String value) {
        return new Hexadecimal(value);
    }

    /**
     * Create an instance of {@link PercentAmount }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PercentAmount }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", name = "PercentAmount")
    public PercentAmount createPercentAmount(BigDecimal value) {
        return new PercentAmount(value);
    }

}
