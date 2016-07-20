package soa.util;

import soa.entity._00Species;
import soa.item.material.Material;
import soa.item.material.raw.specific.MineralGem;
import soa.item.material.raw.specific.MineralMetal;
import soa.item.material.raw.specific.PlantCraft;
import soa.item.material.raw.specific.PlantFood;
import soa.item.material.raw.specific.PlantMedical;
import soa.regs.RegMaterial;
import soa.regs.RegRace;

public class Generate {
	
	//Number
	public static int randRange(int min, int max){
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	//Number
	//Race
	public static _00Species race(String species){
		_00Species race = new _00Species(species, randRange(0,27));
		RegRace.registerRace(race);
		return race;
	}
	public static _00Species race(String species,String family){
		_00Species race =  new _00Species(species, randRange(0,27), family);
		RegRace.registerRace(race);
		return race;
	}
	public static _00Species race(String species,String family, String genus){
		return race(species,randRange(0,27),family,genus);
	}
	public static _00Species race(String species,int c, String family, String genus){
		_00Species race = new _00Species(species, c, family, genus);
		RegRace.registerRace(race);
		return race;
	}
	//Race
	
	//Material Raw
	public static MineralGem gem(String name, int tier){
		int points = Material.getPoints(tier);
		int red = randRange(0,255);
		int green = randRange(0,255);
		int blue = randRange(0,255);
		int alpha = randRange(0,254);
		int strength = randRange(10,points);
		int magic = points-strength;
		
		MineralGem gem = new MineralGem(name, tier, true, strength, magic, red, green, blue, alpha);
		RegMaterial.registerMaterial(gem);
		
		return gem;
		
	}
	
	public static MineralMetal metal(String name, int tier){
		int points = Material.getPoints(tier);
		int red = randRange(0,255);
		int green = randRange(0,255);
		int blue = randRange(0,255);
		int strength = randRange(10,points);
		int conductivity = randRange(0,points-strength);
		int magic = (points-strength)-conductivity;
		
		MineralMetal metal = new MineralMetal(name, tier, true, strength, magic, red, green, blue, conductivity);
		RegMaterial.registerMaterial(metal);
		
		return metal;
		
	}
	
	public static PlantCraft plantCraft(String name, int tier){
		int points = Material.getPoints(tier);
		
		int ammount = randRange(points/4,points);
		int wieght = randRange(1,ammount);
		int time = (points-ammount)-wieght;
		
		int strength = randRange(points/4,points);
		int durability = points-strength;
		
		PlantCraft plant = new PlantCraft(name, tier, false, ammount, time, strength, wieght, durability);
		RegMaterial.registerMaterial(plant);
		
		return plant;
		
	}
	
	public static PlantFood plantFood(String name, int tier){
		int points = Material.getPoints(tier);
		
		int ammount = randRange(points/4,points);
		int time = (points-ammount);
		
		int nurishment = randRange(points/4,points);
		int flavor = points-nurishment;
		
		PlantFood plant = new PlantFood(name, tier, false, ammount, time, nurishment, flavor);
		RegMaterial.registerMaterial(plant);
		
		return plant;
		
	}
	
	public static PlantMedical plantMedical(String name, int tier){
		int points = Material.getPoints(tier);
		
		int ammount = randRange(points/4,points);
		int time = (points-ammount);

		int hi = randRange(0,points/3);
		int si = randRange(0,points/3);
		
		int sr = randRange(0,points-(hi+si));
		int hr = randRange(0,points-(hi+si+sr));
		
		int duration = points-(hi+si+sr+hr);
		
		
		PlantMedical plant = new PlantMedical(name, tier, false, ammount, time, hi, hr, si, sr, duration);
		RegMaterial.registerMaterial(plant);
		
		return plant;
		
	}
	
	//Material Raw
}
