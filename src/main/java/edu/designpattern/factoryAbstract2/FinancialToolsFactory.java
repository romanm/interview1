package edu.designpattern.factoryAbstract2;

import edu.designpattern.factoryAbstract2.product.ShipFeeProcessor;
import edu.designpattern.factoryAbstract2.product.TaxProcessor;

public abstract class FinancialToolsFactory {
    public abstract TaxProcessor createTaxProcessor();
    public abstract ShipFeeProcessor createShipFeeProcessor();
}
