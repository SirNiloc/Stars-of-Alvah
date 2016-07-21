package soa.regs;

import java.util.ArrayList;

import soa.entity._00Species;

public class RegRace {

	private static ArrayList<_00Species> species = new ArrayList<_00Species>();

	public static ArrayList<_00Species> getRaces(){
		return species;
	}
	
	public static void registerRace(_00Species r){
		if(species.contains(r));
		else species.add(r);
	}
}
