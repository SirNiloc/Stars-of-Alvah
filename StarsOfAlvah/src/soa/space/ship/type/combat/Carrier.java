package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Carrier extends ShipType {

	public Carrier(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, rankHealth+15, 13+rankShield, 1+rankSpeed, 1+sci, 20+com, 1+econ, 10+log);
	}

}
