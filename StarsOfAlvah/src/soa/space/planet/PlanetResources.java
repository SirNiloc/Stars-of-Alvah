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
		System.out.println(m.getName()+": "+inventory[m.getID()]+" + "+ammount);
	}
	
	public String toString(){
		String r = "Materials:\n";
		for(int i = 0; i<inventory.length;i++){
			if(inventory[i]>0)r+=RegMaterials.getIndex(i).getName()+" "+inventory[i]+"\n";
		}
		return r;
	}


	

	
	
}
