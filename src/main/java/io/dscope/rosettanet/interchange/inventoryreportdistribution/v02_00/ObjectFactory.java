
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InventoryReportDistributionType }
     * 
     */
    public InventoryReportDistributionType createInventoryReportDistributionType() {
        return new InventoryReportDistributionType();
    }

    /**
     * Create an instance of {@link IntraCompanyTransferType }
     * 
     */
    public IntraCompanyTransferType createIntraCompanyTransferType() {
        return new IntraCompanyTransferType();
    }

    /**
     * Create an instance of {@link InventoryProductQuantityType }
     * 
     */
    public InventoryProductQuantityType createInventoryProductQuantityType() {
        return new InventoryProductQuantityType();
    }

    /**
     * Create an instance of {@link InventoryReportType }
     * 
     */
    public InventoryReportType createInventoryReportType() {
        return new InventoryReportType();
    }

    /**
     * Create an instance of {@link InventoryReportLineItemType }
     * 
     */
    public InventoryReportLineItemType createInventoryReportLineItemType() {
        return new InventoryReportLineItemType();
    }

    /**
     * Create an instance of {@link InventoryReportDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InventoryReportDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.00", name = "InventoryReportDistribution")
    public InventoryReportDistribution createInventoryReportDistribution(InventoryReportDistributionType value) {
        return new InventoryReportDistribution(value);
    }

}
