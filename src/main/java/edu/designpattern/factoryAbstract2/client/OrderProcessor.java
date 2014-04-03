package edu.designpattern.factoryAbstract2.client;

import edu.designpattern.factoryAbstract2.FinancialToolsFactory;
import edu.designpattern.factoryAbstract2.product.ShipFeeProcessor;
import edu.designpattern.factoryAbstract2.product.TaxProcessor;

public class OrderProcessor {  
	private TaxProcessor taxProcessor;
	private ShipFeeProcessor shipFeeProcessor;

	public OrderProcessor(FinancialToolsFactory factory) {
		taxProcessor = factory.createTaxProcessor();
		shipFeeProcessor = factory.createShipFeeProcessor();	
	}
	public void processOrder (Order order) {
		// ....
		taxProcessor.calculateTaxes(order);
		shipFeeProcessor.calculateShipFee(order);
		// ....
	}
}
