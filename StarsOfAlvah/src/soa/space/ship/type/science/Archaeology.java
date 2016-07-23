package soa.space.ship.type.science;

import soa.space.ship.type.ShipType;

public class Archaeology extends ShipType {

	public Archaeology(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n+"-Archaeology", 1+rankHealth, 1+rankShield, 6+rankSpeed, 20+sci, 6+com, 20+econ, 6+log);
	}

}
