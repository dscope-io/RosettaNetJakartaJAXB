
package io.dscope.rosettanet.universal.productidentification.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.productidentification.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.productidentification.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewProductType }
     * 
     */
    public NewProductType createNewProductType() {
        return new NewProductType();
    }

    /**
     * Create an instance of {@link ProductDescriptionType }
     * 
     */
    public ProductDescriptionType createProductDescriptionType() {
        return new ProductDescriptionType();
    }

    /**
     * Create an instance of {@link ProductIdentificationType }
     * 
     */
    public ProductIdentificationType createProductIdentificationType() {
        return new ProductIdentificationType();
    }

    /**
     * Create an instance of {@link ProductSerialIdentificationType }
     * 
     */
    public ProductSerialIdentificationType createProductSerialIdentificationType() {
        return new ProductSerialIdentificationType();
    }

    /**
     * Create an instance of {@link TextualDescriptionType }
     * 
     */
    public TextualDescriptionType createTextualDescriptionType() {
        return new TextualDescriptionType();
    }

    /**
     * Create an instance of {@link NewProduct }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NewProduct }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", name = "NewProduct")
    public NewProduct createNewProduct(NewProductType value) {
        return new NewProduct(value);
    }

    /**
     * Create an instance of {@link ProductDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", name = "ProductDescription")
    public ProductDescription createProductDescription(ProductDescriptionType value) {
        return new ProductDescription(value);
    }

    /**
     * Create an instance of {@link ProductIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", name = "ProductIdentification")
    public ProductIdentification createProductIdentification(ProductIdentificationType value) {
        return new ProductIdentification(value);
    }

    /**
     * Create an instance of {@link ProductSerialIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductSerialIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", name = "ProductSerialIdentification")
    public ProductSerialIdentification createProductSerialIdentification(ProductSerialIdentificationType value) {
        return new ProductSerialIdentification(value);
    }

    /**
     * Create an instance of {@link TextualDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TextualDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", name = "TextualDescription")
    public TextualDescription createTextualDescription(TextualDescriptionType value) {
        return new TextualDescription(value);
    }

}
