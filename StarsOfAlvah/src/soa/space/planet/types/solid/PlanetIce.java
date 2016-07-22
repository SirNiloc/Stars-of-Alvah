package soa.space.planet.types.solid;

import java.util.ArrayList;

import soa.item.material.Material;
import soa.space.planet.Planet;

public class PlanetIce extends Planet {

	public PlanetIce(String n, int t, int p, int w, int o, boolean i, ArrayList<Material> m) {
		super(n, t, p, w, o, i, m);
		checkTemp(t);
	}
	
	private void checkTemp(int t) {
		if(t<0)setTemp(0);
		else if(t>2)setTemp(2);
	}

}
