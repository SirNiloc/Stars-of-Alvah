package soa.item;

import soa.item.weapon.damagetype.DamageType;

public class HandWeapon extends Weapon {

	int hands = 0;
	
	public HandWeapon(String n, int te, DamageType t, double d, double r, double s, int m, int re, int h) {
		super(n, te, t, d, r, s, m, re);
		hands = h;
	}

}
