package edu.designpattern.factoryAbstract2.product;

import edu.designpattern.factoryAbstract2.client.Order;
import edu.designpattern.factoryAbstract2.product.TaxProcessor;

public class EuropeTaxProcessor extends TaxProcessor {
    public void calculateTaxes(Order order) {
        // insert here Europe specific tax calculation
    }
}
