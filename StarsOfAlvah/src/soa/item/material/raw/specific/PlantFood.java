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

}
