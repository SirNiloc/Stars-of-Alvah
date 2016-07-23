package soa.space.ship.type.combat;

import soa.space.ship.type.ShipType;

public class Striker extends ShipType {

	public Striker(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n+"-Striker", rankHealth+2, 10+rankShield, 28+rankSpeed, sci, 20+com, econ, log);
	}

}
