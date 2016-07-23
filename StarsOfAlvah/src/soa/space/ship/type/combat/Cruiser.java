package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Cruiser extends ShipType {

	public Cruiser(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n+"-Cruiser", rankHealth+7, 4+rankShield, 5+rankSpeed, 1+sci, 37+com, 1+econ, 5+log);
	}
}
