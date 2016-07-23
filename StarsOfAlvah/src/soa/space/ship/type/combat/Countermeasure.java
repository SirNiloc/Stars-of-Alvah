package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Countermeasure extends ShipType {

	public Countermeasure(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, rankHealth+15, 15+rankShield, 10+rankSpeed, 1+sci, 17+com, 1+econ, 1+log);
	}

}
