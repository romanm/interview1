package edu.designpattern.factoryAbstract2;

import edu.designpattern.factoryAbstract2.product.CanadaShipFeeProcessor;
import edu.designpattern.factoryAbstract2.product.CanadaTaxProcessor;
import edu.designpattern.factoryAbstract2.product.ShipFeeProcessor;
import edu.designpattern.factoryAbstract2.product.TaxProcessor;

//Factories
public class CanadaFinancialToolsFactory extends FinancialToolsFactory {
 public TaxProcessor createTaxProcessor() {
     return new CanadaTaxProcessor();
 }
 public ShipFeeProcessor createShipFeeProcessor() {
     return new CanadaShipFeeProcessor();
 }
}
