package soa.space.planet.types.liquid;

import java.util.ArrayList;

import soa.item.material.Material;
import soa.space.planet.Planet;

public class PlanetOcean extends Planet {

	public PlanetOcean(String n, int t, int p, int w, int o, boolean i, ArrayList<Material> m) {
		super(n, t, p, w, o, i, m);
		checkTemp(t);
	}
	
	private void checkTemp(int t) {
		if(t<2)setTemp(2);
		else if(t>4)setTemp(4);
	}

}
