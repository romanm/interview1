package edu.designpattern.decorator3;

public class DecoratorDemo {
	// 3. "Core" class with "is a" relationship
	// 2. Second level base class with "isa" relationship
	// 6. Optional embellishment
	public static void main( String[] args ) {
		// 8. Client has the responsibility to compose desired configurations
		Widget aWidget = new BorderDecorator(
				new BorderDecorator(
						new ScrollDecorator(
								new TextField( 80, 24 ))));
		aWidget.draw();
	}
}
