package soa.item.material.raw.specific;

import soa.item.material.raw.Plant;

public class PlantCraft extends Plant{

	int strength;
	int weight;
	int durability;
	
	
	public PlantCraft(String name, int tier, boolean destroyOnHarvest, int growAmmount, int growTime,int strength,int w,int dura) {
		super(name, tier, destroyOnHarvest, growAmmount, growTime);
		this.strength = strength;
		weight = w;
		durability = dura;
	}

}
