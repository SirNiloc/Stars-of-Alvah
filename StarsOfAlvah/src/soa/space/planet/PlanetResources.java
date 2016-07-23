package soa.space.planet;

import soa.item.material.Material;

public class PlanetResources{
	
	long[] inventory;
	
	public PlanetResources(){
		inventory = new long[Material.getCurrentID()];
		
	}

	public void add(Material m, long ammount) {
		inventory[m.getID()]+= ammount;
	}


	

	
	
}
