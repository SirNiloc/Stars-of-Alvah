package soa.space.ship.type.science;

import soa.space.ship.type.ShipType;

public class Solar extends ShipType {

	public Solar(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n+"-Solar", 1+rankHealth, 3+rankShield, 10+rankSpeed, 24+sci, 2+com, 10+econ, 10+log);
	}

}
