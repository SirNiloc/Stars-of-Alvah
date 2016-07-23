package soa.space.planet;

import soa.item.material.Material;
import soa.regs.RegMaterials;

public class PlanetResources{
	
	long[] inventory;
	
	public PlanetResources(){
		inventory = new long[RegMaterials.getCurrentID()+1];
		
	}

	public void add(Material m, long ammount) {
		inventory[m.getID()]+= ammount;
	}


	

	
	
}
