package soa.space.ship.type.econ;

import soa.space.ship.type.ShipType;

public class Cargo extends ShipType {

	public Cargo(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, rankHealth+1, 1+rankShield, 22+rankSpeed, 1+sci, 1+com, 30+econ, 9+log);
	}

}
