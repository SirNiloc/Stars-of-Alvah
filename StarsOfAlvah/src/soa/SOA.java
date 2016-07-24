package soa;

import soa.util.Generate;

public class SOA {

	public static void main(String[] args) {
		for(int i = 0; i<100; i++){
			System.out.println("---------------------------------------------------------------");
			System.out.println(Generate.shipWeapon("SW#"+i, "DT#"+i, i, i));
			System.out.println("---------------------------------------------------------------");
		}

	}
}
