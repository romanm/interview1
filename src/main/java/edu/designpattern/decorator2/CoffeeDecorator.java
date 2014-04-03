package edu.designpattern.decorator2;

public abstract class CoffeeDecorator extends Coffee {
	protected final Coffee decoratedCoffee;
	protected static String ingredientSeparator = ", ";
//	original
//	protected final Coffee decoratedCoffee;
//	protected String ingredientSeparator = ", ";

	public CoffeeDecorator (Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}

	public double getCost() { // Implementing methods of the abstract class
		return decoratedCoffee.getCost();
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
}