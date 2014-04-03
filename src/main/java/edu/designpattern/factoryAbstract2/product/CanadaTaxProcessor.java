package edu.designpattern.factoryAbstract2.product;

import edu.designpattern.factoryAbstract2.client.Order;

public class CanadaTaxProcessor extends TaxProcessor {
    public void calculateTaxes(Order order) {
        // insert here Canada specific tax calculation
    }
}
