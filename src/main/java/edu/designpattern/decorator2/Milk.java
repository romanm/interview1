package edu.designpattern.decorator2;

class Milk extends CoffeeDecorator {
	public Milk (Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	public double getCost() { // Overriding methods defined in the abstract superclass
		return super.getCost() + 0.5;
	}

	public String getIngredients() {
		return super.getIngredients() + ingredientSeparator + "Milk";
	}
}