
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmation.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmation.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmation.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipFromStockAndDebitClaimConfirmationType }
     * 
     */
    public ShipFromStockAndDebitClaimConfirmationType createShipFromStockAndDebitClaimConfirmationType() {
        return new ShipFromStockAndDebitClaimConfirmationType();
    }

    /**
     * Create an instance of {@link AuthorizationInformationType }
     * 
     */
    public AuthorizationInformationType createAuthorizationInformationType() {
        return new AuthorizationInformationType();
    }

    /**
     * Create an instance of {@link InvoiceInformationType }
     * 
     */
    public InvoiceInformationType createInvoiceInformationType() {
        return new InvoiceInformationType();
    }

    /**
     * Create an instance of {@link ProductInformationType }
     * 
     */
    public ProductInformationType createProductInformationType() {
        return new ProductInformationType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ShipFromStockAndDebitClaimConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipFromStockAndDebitClaimConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimConfirmation:xsd:schema:01.00", name = "ShipFromStockAndDebitClaimConfirmation")
    public ShipFromStockAndDebitClaimConfirmation createShipFromStockAndDebitClaimConfirmation(ShipFromStockAndDebitClaimConfirmationType value) {
        return new ShipFromStockAndDebitClaimConfirmation(value);
    }

}
