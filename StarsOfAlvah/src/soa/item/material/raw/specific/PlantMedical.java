package soa.item.material.raw.specific;

import soa.item.material.raw.Plant;

public class PlantMedical extends Plant{

	int healInstant;
	int healRegen;
	
	int spiritInstant;
	int spiritRegen;
	
	int duration;
	
	public PlantMedical(String n, int t,boolean de,int ga,int gt, int healI,int healR,int spiritI,int spiritR,int d) {
		super(n, t,de,ga,gt);

		healInstant = healI;
		healRegen = healR;
		
		spiritInstant = spiritI;
		spiritRegen = spiritR;
		
		duration = d;
		
	}

}
