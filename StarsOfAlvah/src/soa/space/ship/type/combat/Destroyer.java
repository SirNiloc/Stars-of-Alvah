package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Destroyer extends ShipType {

	public Destroyer(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, rankHealth+14, 15+rankShield, 5+rankSpeed, 1+sci, 20+com, 1+econ, 4+log);
	}

}
