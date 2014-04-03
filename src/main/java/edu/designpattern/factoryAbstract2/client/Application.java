package edu.designpattern.factoryAbstract2.client;

import edu.designpattern.factoryAbstract2.CanadaFinancialToolsFactory;
import edu.designpattern.factoryAbstract2.EuropeFinancialToolsFactory;
import edu.designpattern.factoryAbstract2.FinancialToolsFactory;
import edu.designpattern.factoryAbstract2.client.Order;
import edu.designpattern.factoryAbstract2.client.OrderProcessor;

public class Application {
	public static void main(final String[] args) {
		// .....
		final CountryCode countryCode = CountryCode.EU;

		final FinancialToolsFactory factory;
		switch (countryCode) {
		case EU:
			factory = new EuropeFinancialToolsFactory();
			break;
		case CA:
			factory = new CanadaFinancialToolsFactory();
			break;
		default:
			throw new IllegalStateException();
		}

		final OrderProcessor orderProcessor = new OrderProcessor(factory);
		orderProcessor.processOrder(new Order());
	}
}