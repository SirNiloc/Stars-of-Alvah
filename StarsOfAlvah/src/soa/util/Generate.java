package soa.util;

import soa.entity._00Species;
import soa.item.material.Material;
import soa.item.material.raw.gas.Gas;
import soa.item.material.raw.mineral.MineralGem;
import soa.item.material.raw.mineral.MineralMetal;
import soa.item.material.raw.plant.PlantCraft;
import soa.item.material.raw.plant.PlantFood;
import soa.item.material.raw.plant.PlantMedical;
import soa.item.weapon.damagetype.DamageType;
import soa.item.weapon.damagetype.Energy;
import soa.item.weapon.damagetype.Kinetic;
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
import soa.space.ship.Ship;
import soa.space.ship.type.ShipType;
import soa.space.ship.type.combat.Carrier;
import soa.space.ship.type.combat.Countermeasure;
import soa.space.ship.type.combat.Cruiser;
import soa.space.ship.type.combat.Destroyer;
import soa.space.ship.type.combat.Frigate;
import soa.space.ship.type.combat.Stealth;
import soa.space.ship.type.combat.Striker;
import soa.space.ship.type.econ.Cargo;
import soa.space.ship.type.econ.Extractor;
import soa.space.ship.type.logistics.Transport;
import soa.space.ship.type.science.Archaeology;
import soa.space.ship.type.science.Solar;
import soa.space.ship.type.science.Trapper;

public class Generate {
	static RegMaterials regMat = new RegMaterials();
	//Reg
	public static void setRegMaterials(RegMaterials r){
		regMat = r;
	}
	//Reg
	//Util
	public static int randRangeInt(int min, int max){
		return (int) randRangeDouble(min,max);
	}
	public static double randRangeDouble(double min, double max){
		return min + (double)(Math.random() * ((max - min) + 1));
	}
	public static boolean randBoolWieght(int i){
		int r = randRangeInt(0,i);
		if(r==0)return true;
		return false;
	}	
	//Util
	//Race
	public static _00Species race(String species){
		_00Species race = new _00Species(species, randRangeInt(0,27));
		RegRace.registerRace(race);
		return race;
	}
	public static _00Species race(String species,String family){
		_00Species race =  new _00Species(species, randRangeInt(0,27), family);
		RegRace.registerRace(race);
		return race;
	}
	public static _00Species race(String species,String family, String genus){
		return race(species,randRangeInt(0,27),family,genus);
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
		
		int mind = randRangeInt(0,points/3);
		int body = randRangeInt(0,points/3);
		int spirit = randRangeInt(0,points/3);
		
		int energy = randRangeInt(0,points-(mind+body+spirit));
		
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
		int alpha = randRangeInt(0,254);
		int strength = randRangeInt(10,points);
		int magic = points-strength;
		
		int c1 = randRangeInt(170,255);
		int c2 = randRangeInt(85,170);
		int c3 = randRangeInt(0,85);
		
		int randy = randRangeInt(0,5);
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
		int strength = randRangeInt(10,points);
		int conductivity = randRangeInt(0,points-strength);
		int magic = (points-strength)-conductivity;
		
		int c1 = randRangeInt(170,255);
		int c2 = randRangeInt(85,170);
		int c3 = randRangeInt(0,85);
		
		int randy = randRangeInt(0,5);
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
		
		int ammount = randRangeInt(points/4,points);
		int wieght = randRangeInt(1,ammount);
		int time = (points-ammount)-wieght;
		
		int strength = randRangeInt(points/4,points);
		int durability = points-strength;
		
		PlantCraft plant = new PlantCraft(name, tier, false, ammount, time, strength, wieght, durability);
		RegMaterials.register(plant);
		
		return plant;
		
	}
	public static PlantFood plantFood(String name, int tier){
		int points = Material.getPoints(tier);
		
		int ammount = randRangeInt(points/4,points);
		int time = (points-ammount);
		
		int nurishment = randRangeInt(points/4,points);
		int flavor = points-nurishment;
		
		PlantFood plant = new PlantFood(name, tier, false, ammount, time, nurishment, flavor);
		RegMaterials.register(plant);
		
		return plant;
		
	}
	public static PlantMedical plantMedical(String name, int tier){
		int points = Material.getPoints(tier);
		
		int ammount = randRangeInt(points/4,points);
		int time = (points-ammount);

		int hi = randRangeInt(0,points/3);
		int si = randRangeInt(0,points/3);
		
		int sr = randRangeInt(0,points-(hi+si));
		int hr = randRangeInt(0,points-(hi+si+sr));
		
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
			int indy = randRangeInt(-10,RegMaterials.getReg().getGases().size()-1);
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
		return planetGas(name, temp, protection, water, air, inhabit, randRangeInt(0,90000));
	}
	public static Planet planetGas(String name, boolean inhabit){
		return planetGas(name, randRangeInt(0,6), randRangeInt(0,100), randRangeInt(0,3), randRangeInt(0,30), inhabit, randRangeInt(0,90000));
	}
	//Planet Gas
	//Planet Molten
	public static Planet planetMolten(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRangeInt(-10,RegMaterials.getReg().getMinerals().size()-1);
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
		return planetMolten(name, temp, protection, water, air, inhabit, randRangeInt(0,90000));
	}
	public static Planet planetMolten(String name, boolean inhabit){
		return planetMolten(name, randRangeInt(4,5), randRangeInt(0,100), randRangeInt(0,3), randRangeInt(0,30), inhabit, randRangeInt(0,90000));
	}
	//Planet Molten
	//Planet Ocean
	public static Planet planetOcean(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRangeInt(-50,RegMaterials.getReg().getRawMaterials().size()-1);
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
		return planetOcean(name, temp, protection, water, air, inhabit, randRangeInt(0,90000));
	}
	public static Planet planetOcean(String name, boolean inhabit){
		return planetOcean(name, randRangeInt(2,4), randRangeInt(0,100), randRangeInt(0,3), randRangeInt(0,30), inhabit, randRangeInt(0,90000));
	}
	//Planet Ocean
	//Planet Ice
	public static Planet planetIce(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRangeInt(-100,RegMaterials.getReg().getRawMaterials().size()-1);
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
		return planetIce(name, temp, protection, water, air, inhabit, randRangeInt(0,90000));
	}
	public static Planet planetIce(String name, boolean inhabit){
		return planetIce(name, randRangeInt(0,2), randRangeInt(0,100), randRangeInt(0,3), randRangeInt(0,30), inhabit, randRangeInt(0,90000));
	}
	//Planet Ice
	//Planet Mineral
	public static Planet planetMineral(String name, int temp, int protection,int water,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRangeInt(-10,RegMaterials.getReg().getMinerals().size()-1);
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
		return planetMineral(name, temp, protection, water, air, inhabit, randRangeInt(0,90000));
	}
	public static Planet planetMineral(String name, boolean inhabit){
		return planetMineral(name, randRangeInt(0,6), randRangeInt(0,100), randRangeInt(0,3), randRangeInt(0,30), inhabit, randRangeInt(0,90000));
	}
	//Planet Mineral
	//Planet Terra
	public static Planet planetTerra(String name, int temp, int protection,int air,boolean inhabit,long size){
		PlanetResources g = new PlanetResources();
		for(int i = 1; i < size; i++){
			int indy = randRangeInt(-10,RegMaterials.getReg().getMinerals().size()-1);
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
		return planetTerra(name, temp, protection, air, inhabit, randRangeInt(0,90000));
	}
	public static Planet planetTerra(String name, boolean inhabit){
		return planetTerra(name, randRangeInt(2,4), randRangeInt(70,100), randRangeInt(20,30), inhabit, randRangeInt(0,90000));
	}
	//Planet Terra
	//Ship
	public static Ship ship(String name, ShipType type, int t){
		int tier = t;
		if(t < 1) tier = 1;
		double hull = randRangeDouble(1,100);
		int crew = randRangeInt(1,100);
		double shield = randRangeDouble(1,100);
		
		
		return(new Ship(name,type,tier, hull, shield, -1, -1, 100, crew, 0, 0, 0));
	}
	public static Ship ship(String name, String className, int t){
		int tier = t;
		if(t < 1) tier = 1;
		double hull = randRangeDouble(1,100);
		int crew = randRangeInt(1,100);
		double shield = randRangeDouble(1,100);
		
		int tt = randRangeInt(0,13);
		
		ShipType type;
		
		if(tt == 0) type = solar(className);
		else if(tt == 1) type = transport(className);
		else if(tt == 2) type = carrier(className);
		else if(tt == 3) type = defense(className);
		else if(tt == 4) type = cruiser(className);
		else if(tt == 5) type = destroyer(className);
		else if(tt == 6) type = frigate(className);
		else if(tt == 7) type = stealth(className);
		else if(tt == 8) type = striker(className);
		else if(tt == 9) type = cargo(className);
		else if(tt == 10) type = extractor(className);
		else if(tt == 11) type = trapper(className);
		else if(tt == 12) type = archaeology(className);
		else type = shipClass(className);
		
		
		return(new Ship(name,type,tier, hull, shield, -1, -1, 100, crew, 0, 0, 0));
	}
	//Ship
	//Ship Type
	public static ShipType shipClass(String name){
		int h = randRangeInt(1,60);
		int log = randRangeInt(1,60);
		int econ = randRangeInt(1,60);
		int com = randRangeInt(1,60);
		int sci = randRangeInt(1,60);
		int speed = randRangeInt(1,60);
		int s = randRangeInt(1,60);
		
		return new ShipType(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Transport transport(String name){
		int h = randRangeInt(1,30);
		int log = randRangeInt(1,230);
		int econ = randRangeInt(1,30);
		int com = randRangeInt(1,30);
		int sci = randRangeInt(1,20);
		int speed = randRangeInt(1,230);
		int s = randRangeInt(1,30);
		
		return new Transport(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Carrier carrier(String name){
		int h = randRangeInt(1,150);
		int log = randRangeInt(1,100);
		int econ = randRangeInt(1,10);
		int com = randRangeInt(1,200);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,10);
		int s = randRangeInt(1,130);
		
		return new Carrier(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Countermeasure defense(String name){
		int h = randRangeInt(1,150);
		int log = randRangeInt(1,10);
		int econ = randRangeInt(1,10);
		int com = randRangeInt(1,170);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,100);
		int s = randRangeInt(1,150);
		
		return new Countermeasure(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Cruiser cruiser(String name){
		int h = randRangeInt(1,70);
		int log = randRangeInt(1,50);
		int econ = randRangeInt(1,10);
		int com = randRangeInt(1,370);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,50);
		int s = randRangeInt(1,40);
		
		return new Cruiser(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Destroyer destroyer(String name){
		int h = randRangeInt(1,140);
		int log = randRangeInt(1,40);
		int econ = randRangeInt(1,10);
		int com = randRangeInt(1,200);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,50);
		int s = randRangeInt(1,150);
		
		return new Destroyer(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Frigate frigate(String name){
		int h = randRangeInt(1,100);
		int log = randRangeInt(1,40);
		int econ = randRangeInt(1,40);
		int com = randRangeInt(1,100);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,220);
		int s = randRangeInt(1,100);
		
		return new Frigate(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Stealth stealth(String name){
		int h = randRangeInt(1,10);
		int log = randRangeInt(1,50);
		int econ = randRangeInt(1,50);
		int com = randRangeInt(1,230);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,200);
		int s = randRangeInt(1,50);
		
		return new Stealth(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Striker striker(String name){
		int h = randRangeInt(1,20);
		int log = randRangeInt(1,1);
		int econ = randRangeInt(1,1);
		int com = randRangeInt(1,200);
		int sci = randRangeInt(1,1);
		int speed = randRangeInt(1,280);
		int s = randRangeInt(1,100);
		
		return new Striker(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Cargo cargo(String name){
		int h = randRangeInt(1,10);
		int log = randRangeInt(1,90);
		int econ = randRangeInt(1,300);
		int com = randRangeInt(1,10);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,220);
		int s = randRangeInt(1,10);
		
		return new Cargo(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Extractor extractor(String name){
		int h = randRangeInt(1,10);
		int log = randRangeInt(1,90);
		int econ = randRangeInt(1,300);
		int com = randRangeInt(1,80);
		int sci = randRangeInt(1,10);
		int speed = randRangeInt(1,80);
		int s = randRangeInt(1,80);
		
		return new Extractor(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Trapper trapper(String name){
		int h = randRangeInt(1,10);
		int log = randRangeInt(1,150);
		int econ = randRangeInt(1,150);
		int com = randRangeInt(1,50);
		int sci = randRangeInt(1,150);
		int speed = randRangeInt(1,70);
		int s = randRangeInt(1,20);
		
		return new Trapper(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Archaeology archaeology(String name){
		int h = randRangeInt(1,10);
		int log = randRangeInt(1,60);
		int econ = randRangeInt(1,200);
		int com = randRangeInt(1,60);
		int sci = randRangeInt(1,200);
		int speed = randRangeInt(1,60);
		int s = randRangeInt(1,10);
		
		return new Archaeology(name, h, s, speed, sci, com, econ, log);
	}
	
	public static Solar solar(String name){
		int h = randRangeInt(1,10);
		int log = randRangeInt(1,100);
		int econ = randRangeInt(1,100);
		int com = randRangeInt(1,20);
		int sci = randRangeInt(1,240);
		int speed = randRangeInt(1,100);
		int s = randRangeInt(1,30);
		
		return new Solar(name, h, s, speed, sci, com, econ, log);
	}
	//Ship Type
	//Damage Type
	public static DamageType damageType(String name){
		double flesh = randRangeDouble(1, 100);
		double armor = randRangeDouble(1, 100);
		double shield = randRangeDouble(1, 100);
		double energy = randRangeDouble(1, 100);
		
		return new DamageType(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	
	public static Energy damageEnergy(String name){
		double flesh = randRangeDouble(1, 50);
		double armor = randRangeDouble(1, 50);
		double shield = randRangeDouble(1, 100);
		double energy = randRangeDouble(1, 100);
		
		return new Energy(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	
	public static Kinetic damageKinetic(String name){
		double flesh = randRangeDouble(1, 100);
		double armor = randRangeDouble(1, 100);
		double shield = randRangeDouble(1, 50);
		double energy = randRangeDouble(1, 50);
		
		return new Kinetic(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	
	public static DamageType damageFlesh(String name){
		double flesh = randRangeDouble(1, 123);
		double armor = randRangeDouble(1, 5);
		double shield = randRangeDouble(1, 5);
		double energy = randRangeDouble(1, 5);
		
		return new DamageType(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	public static DamageType damageAura(String name){
		double flesh = randRangeDouble(1, 5);
		double armor = randRangeDouble(1, 5);
		double shield = randRangeDouble(1, 5);
		double energy = randRangeDouble(1, 123);
		
		return new DamageType(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	public static DamageType damageArmor(String name){
		double flesh = randRangeDouble(1, 5);
		double armor = randRangeDouble(1, 123);
		double shield = randRangeDouble(1, 5);
		double energy = randRangeDouble(1, 5);
		
		return new DamageType(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	public static DamageType damageShield(String name){
		double flesh = randRangeDouble(1, 5);
		double armor = randRangeDouble(1, 5);
		double shield = randRangeDouble(1, 123);
		double energy = randRangeDouble(1, 5);
		
		return new DamageType(name, flesh, armor, shield, energy, randBoolWieght(50));
	}
	//Damage Type
}
