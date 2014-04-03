package edu.designpattern.facade2;
/* Client */
class You {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}
}