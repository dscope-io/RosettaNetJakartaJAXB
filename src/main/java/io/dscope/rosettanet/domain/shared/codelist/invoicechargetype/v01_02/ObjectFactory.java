
package io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceChargeTypeType }
     * 
     */
    public InvoiceChargeTypeType createInvoiceChargeTypeType() {
        return new InvoiceChargeTypeType();
    }

    /**
     * Create an instance of {@link InvoiceChargeTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InvoiceChargeTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02", name = "InvoiceChargeTypeA")
    public InvoiceChargeTypeA createInvoiceChargeTypeA(Object value) {
        return new InvoiceChargeTypeA(value);
    }

    /**
     * Create an instance of {@link InvoiceChargeType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InvoiceChargeType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02", name = "InvoiceChargeType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02", substitutionHeadName = "InvoiceChargeTypeA")
    public InvoiceChargeType createInvoiceChargeType(InvoiceChargeTypeType value) {
        return new InvoiceChargeType(value);
    }

}
