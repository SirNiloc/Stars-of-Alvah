package soa.item.weapon.damagetype;

public class Kinetic extends DamageType {

	public Kinetic(String name, double f, double a, double s, double e, boolean pen) {
		super("Kinetic-"+name, f*2, a*2, s, e, pen);
	}

}
