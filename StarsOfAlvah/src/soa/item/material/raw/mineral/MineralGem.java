package soa.item.material.raw.mineral;

public class MineralGem extends Mineral{
	
	public MineralGem(String name, int tier, boolean destroyOnHarvest, int strength, int magic, int red, int green,
			int blue,int alpha) {
		super(name, tier, destroyOnHarvest, strength, magic, red, green, blue,alpha);
		
	}

	public String toString(){
		return "Name: "+getName()+"\n"+
				"Tier: "+getTier()+"\n"+
				"Strength: "+getStrength()+"\n"+
				"Magic: "+getMagic()+"\n"+
				"Color: "+getRed()+" "+getBlue()+" "+getGreen()+" "+getAlpha();
	}
	
	
}
