package edu.designpattern.decorator3;

class TextField implements Widget {
	private int width, height;
	public TextField( int w, int h ) {
		width  = w;
		height = h;
	}
	public void draw() {
		System.out.println( "TextField: " + width + ", " + height );
	}
}