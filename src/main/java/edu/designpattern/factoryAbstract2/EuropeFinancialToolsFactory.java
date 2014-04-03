package edu.designpattern.factoryAbstract2;

import edu.designpattern.factoryAbstract2.product.EuropeShipFeeProcessor;
import edu.designpattern.factoryAbstract2.product.EuropeTaxProcessor;
import edu.designpattern.factoryAbstract2.product.ShipFeeProcessor;
import edu.designpattern.factoryAbstract2.product.TaxProcessor;

public class EuropeFinancialToolsFactory extends FinancialToolsFactory {
	public TaxProcessor createTaxProcessor() {
		return new EuropeTaxProcessor();
	}
	public ShipFeeProcessor createShipFeeProcessor() {
		return new EuropeShipFeeProcessor();
	}
}
