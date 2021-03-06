package soa.item.material.raw.plant;

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
	
	public String toString(){
		return "Name: "+getName()+"\n"+
				"Tier: "+getTier()+"\n"+
				"Strength: "+getStrength()+"\n"+
				"Weight: "+getWeight()+"\n"+
				"Durability: "+getDurability()+"\n"+
				"Grow Time: "+getGT()+"\n"
				+"Yeild: "+getGA();
	}

	private int getDurability() {
		return durability;
	}

	private int getWeight() {
		return weight;
	}

	private int getStrength() {
		return strength;
	}

}
