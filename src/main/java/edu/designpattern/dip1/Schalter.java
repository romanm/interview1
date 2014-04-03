package edu.designpattern.dip1;

public class Schalter {
	private SchalterKlient klient;
	private boolean gedrueckt;

	public Schalter(SchalterKlient klient) {
		this.klient= klient;
	}

	public void drueckeSchalter() {
		gedrueckt = !gedrueckt;
		if(gedrueckt) {
			klient.geheAn();
		} else {
			klient.geheAus();
		}
	}
}