package soa;

import soa.util.Generate;

public class SOA {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++){
			System.out.println();
			System.out.println(Generate.gem("Gem "+i, 1).toString());
			System.out.println(Generate.metal("Metal "+i, 1).toString());
			System.out.println(Generate.plantCraft("Craft "+i, 1).toString());
			System.out.println(Generate.plantFood("Food "+i, 1).toString());
			System.out.println(Generate.plantMedical("Medical "+i, 1).toString());
			System.out.println();
		}

	}
}
