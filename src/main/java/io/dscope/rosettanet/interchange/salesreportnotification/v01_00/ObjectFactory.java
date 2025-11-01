
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.salesreportnotification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.salesreportnotification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesReportNotificationType }
     * 
     */
    public SalesReportNotificationType createSalesReportNotificationType() {
        return new SalesReportNotificationType();
    }

    /**
     * Create an instance of {@link ProductTransferType }
     * 
     */
    public ProductTransferType createProductTransferType() {
        return new ProductTransferType();
    }

    /**
     * Create an instance of {@link SalesReportType }
     * 
     */
    public SalesReportType createSalesReportType() {
        return new SalesReportType();
    }

    /**
     * Create an instance of {@link SalesReportLineItemType }
     * 
     */
    public SalesReportLineItemType createSalesReportLineItemType() {
        return new SalesReportLineItemType();
    }

    /**
     * Create an instance of {@link SpecialPriceClaimType }
     * 
     */
    public SpecialPriceClaimType createSpecialPriceClaimType() {
        return new SpecialPriceClaimType();
    }

    /**
     * Create an instance of {@link SalesReportNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SalesReportNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0", name = "SalesReportNotification")
    public SalesReportNotification createSalesReportNotification(SalesReportNotificationType value) {
        return new SalesReportNotification(value);
    }

}
