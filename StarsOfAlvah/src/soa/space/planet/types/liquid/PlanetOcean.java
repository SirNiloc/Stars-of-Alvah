package soa.space.planet.types.liquid;

import soa.space.planet.Planet;
import soa.space.planet.PlanetResources;

public class PlanetOcean extends Planet {

	public PlanetOcean(String n, int t, int p, int w, int o, boolean i,long s, PlanetResources m) {
		super(n, t, p, w, o, i,s, m);
		checkTemp(t);
	}
	
	private void checkTemp(int t) {
		if(t<2)setTemp(2);
		else if(t>4)setTemp(4);
	}

}
