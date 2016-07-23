package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Stealth extends ShipType {

	public Stealth(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, rankHealth+1, 5+rankShield, 20+rankSpeed, 1+sci, 23+com, 5+econ, 5+log);
	}

}
