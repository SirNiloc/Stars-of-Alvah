package soa.item.material.raw.specific;

import soa.item.material.raw.Plant;

public class PlantCraft extends Plant{

	int strength;
	int weight;
	int durability;
	
	
	public PlantCraft(String n, int t, boolean d, int ga, int gt,int str,int w,int dura) {
		super(n, t, d, ga, gt);
		strength = str;
		weight = w;
		durability = dura;
	}

}
