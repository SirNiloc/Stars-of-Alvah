package soa.util;

import soa.entity._00Species;
import soa.item.material.Material;
import soa.item.material.raw.gas.Gas;
import soa.item.material.raw.mineral.MineralGem;
import soa.item.material.raw.mineral.MineralMetal;
import soa.item.material.raw.plant.PlantCraft;
import soa.item.material.raw.plant.PlantFood;
import soa.item.material.raw.plant.PlantMedical;
import soa.regs.RegMaterials;
import soa.regs.RegPlanet;
import soa.regs.RegRace;
import soa.space.planet.Planet;
import soa.space.planet.PlanetResources;
import soa.space.planet.types.PlanetTerra;
import soa.space.planet.types.gas.PlanetGas;
import soa.space.planet.types.liquid.PlanetMolten;
import soa.space.planet.types.liquid.PlanetOcean;
import soa.space.planet.types.solid.PlanetIce;
import soa.space.planet.types.solid.PlanetMineral;

public class Generate {
	static RegMaterials regMat = new RegMaterials();
	//Reg
	public static void setRegMaterials(RegMaterials r){
		regMat = r;
	}
	//Reg
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
	//Material Gas
	public static Gas gas(String name, int tier) {
		int points = Material.getPoints(tier);
		
		int mind = randRange(0,points/3);
		int body = randRange(0,points/3);
		int spirit = randRange(0,points/3);
		
		int energy = randRange(0,points-(mind+body+spirit));
		
		Gas gas = new Gas(name, tier, false, energy, mind, body, spirit);
		RegMaterials.register(gas);
		
		return gas;
	}
	//Material Gas
	//Material Raw
	public static MineralGem gem(String name, int tier){
		int points = Material.getPoints(tier);
		int red;
		int green;
		int blue;
		int alpha = randRange(0,254);
		int strength = randRange(10,points);
		int magic = points-strength;
		
		int c1 = randRange(170,255);
		int c2 = randRange(85,170);
		int c3 = randRange(0,85);
		
		int randy = randRange(0,5);
		if(randy == 1){
			red = c1;
			green = c2;
			blue = c3;
		}else if(randy == 2){
			red = c1;
			blue = c2;
			green = c3;
		}else if(randy == 3){
			blue = c1;
			green = c2;
			red = c3;
		}else if(randy == 4){
			blue = c1;
			red = c2;
			green = c3;
		}else if(randy == 5){
			green = c1;
			red = c2;
			blue = c3;
		}else{
			green = c1;
			blue = c2;
			red = c3;
		}
		
		MineralGem gem = new MineralGem(name, tier, true, strength, magic, red, green, blue, alpha);
		RegMaterials.register(gem);
		
		return gem;
		
	}
	public static MineralMetal metal(String name, int tier){
		int points = Material.getPoints(tier);
		int red;
		int green;
		int blue;
		int strength = randRange(10,points);
		int conductivity = randRange(0,points-strength);
		int magic = (points-strength)-conductivity;
		
		int c1 = randRange(170,255);
		int c2 = randRange(85,170);
		int c3 = randRange(0,85);
		
		int randy = randRange(0,5);
		if(randy == 1){
			red = c1;
			green = c2;
			blue = c3;
		}else if(randy == 2){
			red = c1;
			blue = c2;
			green = c3;
		}else if(randy == 3){
			blue = c1;
			green = c2;
			red = c3;
		}else if(randy == 4){
			blue = c1;
			red = c2;
			green = c3;
		}else if(randy == 5){
			green = c1;
			red = c2;
			blue = c3;
		}else{
			green = c1;
			blue = c2;
			red = c3;
		}
			
		MineralMetal metal = new MineralMetal(name, tier, true, strength, magic, red, green, blue, conductivity);
		RegMaterials.register(metal);
		
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
		RegMaterials.register(plant);
		
		return plant;
		
	}
	public static PlantFood plantFood(String name, int tier){
		int points = Material.getPoints(tier);
		
		int ammount = randRange(points/4,points);
		int time = (points-ammount);
		
		int nurishment = randRange(points/4,points);
		int flavor = points-nurishment;
		
		PlantFood plant = new PlantFood(name, tier, false, ammount, time, nurishment, flavor);
		RegMaterials.register(plant);
		
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
		RegMaterials.register(plant);
		
		return plant;
		
	}
	//Material Raw
	//Planet Gas
	public static Planet planetGas(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRange(-10,RegMaterials.getReg().getGases().size()-1);
			try{
				g.add(RegMaterials.getReg().getGases().get(indy), 1);
			}catch(ArrayIndexOutOfBoundsException e){}
			catch(IndexOutOfBoundsException e){}
		}
		PlanetGas planet = new PlanetGas(name, temp, protection, water, air, inhabit,size, g);
		RegPlanet.registerPlanet(planet);
		return planet;
	}
	public static Planet planetGas(String name, int temp, int protection,int water,int air,boolean inhabit){
		return planetGas(name, temp, protection, water, air, inhabit, randRange(0,90000));
	}
	public static Planet planetGas(String name, boolean inhabit){
		return planetGas(name, randRange(0,6), randRange(0,100), randRange(0,3), randRange(0,30), inhabit, randRange(0,90000));
	}
	//Planet Gas
	//Planet Molten
	public static Planet planetMolten(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRange(-10,RegMaterials.getReg().getMinerals().size()-1);
			try{
				g.add(RegMaterials.getReg().getMinerals().get(indy), 1);
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
		PlanetMolten planet = new PlanetMolten(name, temp, protection, water, air, inhabit,size, g);
		RegPlanet.registerPlanet(planet);
		return planet;
	}
	public static Planet planetMolten(String name, int temp, int protection,int water,int air,boolean inhabit){
		return planetMolten(name, temp, protection, water, air, inhabit, randRange(0,90000));
	}
	public static Planet planetMolten(String name, boolean inhabit){
		return planetMolten(name, randRange(4,5), randRange(0,100), randRange(0,3), randRange(0,30), inhabit, randRange(0,90000));
	}
	//Planet Molten
	//Planet Ocean
	public static Planet planetOcean(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRange(-50,RegMaterials.getReg().getRawMaterials().size()-1);
			try{
				g.add(RegMaterials.getReg().getRawMaterials().get(indy), 1);
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
		PlanetOcean planet = new PlanetOcean(name, temp, protection, water, air, inhabit,size, g);
		RegPlanet.registerPlanet(planet);
		return planet;
	}
	public static Planet planetOcean(String name, int temp, int protection,int water,int air,boolean inhabit){
		return planetOcean(name, temp, protection, water, air, inhabit, randRange(0,90000));
	}
	public static Planet planetOcean(String name, boolean inhabit){
		return planetOcean(name, randRange(2,4), randRange(0,100), randRange(0,3), randRange(0,30), inhabit, randRange(0,90000));
	}
	//Planet Ocean
	//Planet Ice
	public static Planet planetIce(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRange(-100,RegMaterials.getReg().getRawMaterials().size()-1);
			try{
				g.add(RegMaterials.getReg().getRawMaterials().get(indy), 1);
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
		PlanetIce planet = new PlanetIce(name, temp, protection, water, air, inhabit,size, g);
		RegPlanet.registerPlanet(planet);
		return planet;
	}
	public static Planet planetIce(String name, int temp, int protection,int water,int air,boolean inhabit){
		return planetIce(name, temp, protection, water, air, inhabit, randRange(0,90000));
	}
	public static Planet planetIce(String name, boolean inhabit){
		return planetIce(name, randRange(0,2), randRange(0,100), randRange(0,3), randRange(0,30), inhabit, randRange(0,90000));
	}
	//Planet Ice
	//Planet Mineral
	public static Planet planetMineral(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRange(-10,RegMaterials.getReg().getMinerals().size()-1);
			try{
				g.add(RegMaterials.getReg().getMinerals().get(indy), 1);
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
		PlanetMineral planet = new PlanetMineral(name, temp, protection, water, air, inhabit,size, g);
		RegPlanet.registerPlanet(planet);
		return planet;
	}
	public static Planet planetMineral(String name, int temp, int protection,int water,int air,boolean inhabit){
		return planetMineral(name, temp, protection, water, air, inhabit, randRange(0,90000));
	}
	public static Planet planetMineral(String name, boolean inhabit){
		return planetMineral(name, randRange(0,6), randRange(0,100), randRange(0,3), randRange(0,30), inhabit, randRange(0,90000));
	}
	//Planet Mineral
	//Planet Terra
	public static Planet planetTerra(String name, int temp, int protection,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRange(-10,RegMaterials.getReg().getMinerals().size()-1);
			try{
				g.add(RegMaterials.getReg().getMinerals().get(indy), 1);
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
		PlanetTerra planet = new PlanetTerra(name, temp, protection, air, inhabit,size, g);
		RegPlanet.registerPlanet(planet);
		return planet;
	}
	public static Planet planetTerra(String name, int temp, int protection,int air,boolean inhabit){
		return planetTerra(name, temp, protection, air, inhabit, randRange(0,90000));
	}
	public static Planet planetTerra(String name, boolean inhabit){
		return planetTerra(name, randRange(2,4), randRange(70,100), randRange(20,30), inhabit, randRange(0,90000));
	}
	//Planet Terra
	
}
