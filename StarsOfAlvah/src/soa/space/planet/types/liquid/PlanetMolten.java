package soa.space.planet.types.liquid;

import java.util.ArrayList;

import soa.item.material.raw.mineral.Mineral;
import soa.space.planet.types.solid.PlanetMineral;

public class PlanetMolten extends PlanetMineral {


	
	public PlanetMolten(String n, int t, int p, int w, int o, boolean i, ArrayList<Mineral> m) {
		super(n, t, p, w, o, i, m);
		checkTemp(t);
	}

	private void checkTemp(int t) {
		if(t<4)setTemp(4);
		else if(t>5)setTemp(5);
	}

}
