package soa.item.material.raw.specific;

import soa.item.material.raw.Mineral;

public class MineralMetal extends Mineral{

	int conductivity;
	
	public MineralMetal(String name, int tier, boolean destroyOnHarvest, int strength, int magic, int red,int green, int blue,int conduct) {
		super(name, tier, destroyOnHarvest, strength, magic, red, green, blue,255);
		conductivity = conduct;
	}

	public String toString(){
		return "Name: "+getName()+"\n"+
				"Tier: "+getTier()+"\n"+
				"Strength: "+getStrength()+"\n"+
				"Magic: "+getMagic()+"\n"+
				"Conductivity: "+getConductivity()+"\n"+
				"Color: "+getRed()+" "+getGreen()+" "+getBlue();
	}

	private int getConductivity() {
		return conductivity;
	}
}
