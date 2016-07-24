package soa.item.slot.combat;

import soa.item.Weapon;
import soa.item.slot.Slot;
import soa.item.weapon.damagetype.DamageType;

public class ShipWeapon extends Weapon implements Slot {

	private int slotCost = 0;
	
	public ShipWeapon(String n, int te, DamageType t, double d, double r, double s, int m, int re, int slot) {
		super(n, te, t, d, r, s, m, re);
		slotCost = slot;
	}
	
	@Override
	public int getSlotCost(){
		return slotCost;
	}
}
