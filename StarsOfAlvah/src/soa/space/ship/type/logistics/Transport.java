package soa.space.ship.type.logistics;

import soa.space.ship.type.ShipType;

public class Transport extends ShipType {

	public Transport(String n, int rankHealth, int rankShield, int rankSpeed, int sci, int com, int econ, int log) {
		super(n, 3+rankHealth, 3+rankShield, 23+rankSpeed, 2+sci, 3+com, 3+econ, 23+log);
	}

}
