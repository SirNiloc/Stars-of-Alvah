package soa.item.material.raw.specific;

import soa.item.material.raw.Plant;

public class PlantMedical extends Plant{

	private int healInstant;
	private int healRegen;
	
	private int spiritInstant;
	private int spiritRegen;
	
	private int duration;
	
	public PlantMedical(String n, int t,boolean de,long ammount,int ga,int gt, int healI,int healR,int spiritI,int spiritR,int d) {
		super(n, t,de,ammount,ga,gt);

		healInstant = healI;
		healRegen = healR;
		
		spiritInstant = spiritI;
		spiritRegen = spiritR;
		
		duration = d;
		
	}
	
	public String toString(){
		return "Name: "+getName()+"\n"+
				"Tier: "+getTier()+"\n"+
				"Heal: "+getInstantHeal()+"\n"+
				"Magic: "+getInstantMagic()+"\n"+
				"Heal Regen: "+getRegenH()+"\n"+				
				"Magic Regen: "+getRegenM()+"\n"+
				"Regen Duration: "+getRegenDuration()+"\n"+
				"Grow Time: "+getGT()+"\n"
				+"Yeild: "+getGA();
	}

	private int getRegenDuration() {
		return duration;
	}

	private int getRegenM() {
		return spiritRegen;
	}

	private int getRegenH() {
		return healRegen;
	}

	private int getInstantMagic() {
		return spiritInstant;
	}

	private int getInstantHeal() {
		return healInstant;
	}

}
