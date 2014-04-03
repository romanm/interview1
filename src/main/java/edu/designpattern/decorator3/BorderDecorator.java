package edu.designpattern.decorator3;

class BorderDecorator extends Decorator {
	public BorderDecorator( Widget w ) {
		super( w );
	}
	public void draw() {
		super.draw(); // 7. Delegate to base class and add extra stuff
		System.out.println("  BorderDecorator");
	}
}