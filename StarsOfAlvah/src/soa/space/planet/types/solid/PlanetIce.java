package soa.space.planet.types.solid;

import soa.space.planet.Planet;
import soa.space.planet.PlanetResources;

public class PlanetIce extends Planet {

	public PlanetIce(String n, int t, int p, int w, int o, boolean i,long s, PlanetResources m) {
		super(n, t, p, w, o, i,s, m);
		checkTemp(t);
	}
	
	private void checkTemp(int t) {
		if(t<0)setTemp(0);
		else if(t>2)setTemp(2);
	}

}
