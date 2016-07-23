package soa.space.ship;

import soa.space.ship.type.ShipType;

public class Capitol extends Ship {

	public Capitol(String n, ShipType t, double hull, double shield, double ch, double cs, double f, int c, long xx,
			long yy, long zz) {
		super(n, t, 1.5*hull, 1.5*shield, 1.5*ch, 1.5*cs, f, 2*c, xx, yy, zz);
	}

}
