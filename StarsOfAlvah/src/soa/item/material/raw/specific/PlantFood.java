package soa.item.material.raw.specific;

import soa.item.material.raw.Plant;

public class PlantFood extends Plant{

	int nurishment;
	int flavor;
	
	
	public PlantFood(String n, int t,boolean d,int ga,int gt, int nu, int f) {
		super(n, t,d,ga, gt);
		nurishment = nu;
		flavor = f;
	}

}
