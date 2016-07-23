package soa.space.ship.type.econ;

import soa.space.ship.type.ShipType;

public class Extractor extends ShipType{

	public Extractor(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n+"-Extractor", rankHealth+1, 8+rankShield, 8+rankSpeed, 1+sci, 8+com, 30+econ, 9+log);
	}

}
