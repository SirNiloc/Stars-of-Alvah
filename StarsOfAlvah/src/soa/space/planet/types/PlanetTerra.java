package soa.space.planet.types;

import soa.space.planet.Planet;
import soa.space.planet.PlanetResources;

public class PlanetTerra extends Planet {

	public PlanetTerra(String name, int temp, int protect, int air, boolean i,long s, PlanetResources m) {
		super(name, temp, protect, 2, air, i,s, m);
		checkTemp(temp);
		checkProtect(protect);
		checkAir(air);
	}

	private void checkTemp(int t) {
		if(t<2)setTemp(2);
		else if(t>4)setTemp(4);
	}
	
	private void checkProtect(int t) {
		if(t<70)setRad(70);
	}
	private void checkAir(int t) {
		if(t<20)setOxygen(20);	
	}
	

}
