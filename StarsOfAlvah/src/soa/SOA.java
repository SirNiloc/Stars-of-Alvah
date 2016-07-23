package soa;

import soa.util.Generate;

public class SOA {

	public static void main(String[] args) {
		for(int i = 0; i<100; i++){
			System.out.println("---------------------------------------------------------------");
			System.out.println(Generate.damageType("Type#"+i));
			System.out.println(Generate.damageEnergy("Type#"+i));
			System.out.println(Generate.damageKinetic("Type#"+i));
			
			System.out.println(Generate.damageFlesh("Flesh#"+i));
			System.out.println(Generate.damageArmor("Armor#"+i));
			System.out.println(Generate.damageShield("Shield#"+i));
			System.out.println(Generate.damageAura("Aura#"+i));
			System.out.println("---------------------------------------------------------------");
		}

	}
}
