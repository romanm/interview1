package edu.designpattern.facade1;

class FacadeDemo {
	public static void main( String[] args ) {
		// 3. Client uses the Facade
		Line line1 = new Line( new Point(2,4), new Point(5,7) );
		System.out.println( "begin:  " + line1 );
		line1.move(-2,-4);
		System.out.println( "after move:  " + line1 );
		line1.rotate(45);
		System.out.println( "after rotate: " + line1 );
		Line line2 = new Line( new Point(2,1), new Point(2.866,1.5) );
		line2.rotate(30);
		System.out.println( "30 degrees to 60 degrees: " + line2 );
	}
}