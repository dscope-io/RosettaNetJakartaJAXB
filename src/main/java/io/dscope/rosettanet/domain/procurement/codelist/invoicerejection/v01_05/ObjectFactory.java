
package io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_05;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_05 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceRejectionType }
     * 
     */
    public InvoiceRejectionType createInvoiceRejectionType() {
        return new InvoiceRejectionType();
    }

    /**
     * Create an instance of {@link InvoiceRejectionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InvoiceRejectionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.05", name = "InvoiceRejectionA")
    public InvoiceRejectionA createInvoiceRejectionA(Object value) {
        return new InvoiceRejectionA(value);
    }

    /**
     * Create an instance of {@link InvoiceRejection }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InvoiceRejection }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.05", name = "InvoiceRejection", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.05", substitutionHeadName = "InvoiceRejectionA")
    public InvoiceRejection createInvoiceRejection(InvoiceRejectionType value) {
        return new InvoiceRejection(value);
    }

}
