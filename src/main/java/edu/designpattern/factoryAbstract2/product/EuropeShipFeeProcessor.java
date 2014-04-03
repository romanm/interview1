package edu.designpattern.factoryAbstract2.product;

import edu.designpattern.factoryAbstract2.client.Order;
import edu.designpattern.factoryAbstract2.product.ShipFeeProcessor;

public class EuropeShipFeeProcessor extends ShipFeeProcessor {
    public void calculateShipFee(Order order) {
        // insert here Europe specific ship fee calculation
    }
}
