package soa.item.material.raw.specific;

import soa.item.material.raw.Plant;

public class PlantFood extends Plant{

	int nurishment;
	int flavor;
	
	
	public PlantFood(String name, int tier,boolean d,int ga,int gt, int nu, int f) {
		super(name,tier,d,ga, gt);
		nurishment = nu;
		flavor = f;
	}
	
	public String toString(){
		return "Name: "+getName()+"\n"+
				"Tier: "+getTier()+"\n"+
				"Hunger: "+getNourishment()+"\n"+
				"Flavor: "+getFlavor()+"\n"+
				"Grow Time: "+getGT()+"\n"
				+"Yeild: "+getGA();
	}

	private int getNourishment() {
		return nurishment;
	}

	private int getFlavor() {
		return flavor;
	}


}
