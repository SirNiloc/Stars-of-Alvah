package soa.space.ship.type.science;

import soa.space.ship.type.ShipType;

public class Trapper extends ShipType {
	
	public Trapper(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, 1+rankHealth, 2+rankShield, 7+rankSpeed, 15+sci, 5+com, 15+econ, 15+log);
	}

}
