package edu.designpattern.decorator1;

abstract class WindowDecorator implements Window {
	protected Window decoratedWindow; // the Window being decorated

	public WindowDecorator (Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
	public void draw() {
		decoratedWindow.draw(); //Delegation
	}
	public String getDescription() {
		return decoratedWindow.getDescription(); //Delegation
	}
}