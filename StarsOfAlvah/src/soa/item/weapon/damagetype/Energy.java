package soa.item.weapon.damagetype;

public class Energy extends DamageType {

	public Energy(String name, double f, double a, double s, double e, boolean pen) {
		super("Energy-"+name, f, a, s*4, e, pen);
	}

}
