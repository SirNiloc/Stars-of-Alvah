package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Frigate extends ShipType {

	public Frigate(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, rankHealth+10, 10+rankShield, 22+rankSpeed, 1+sci, 10+com, 4+econ, 4+log);
	}

}
