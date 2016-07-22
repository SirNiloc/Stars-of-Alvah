package soa.space.planet.types;

import java.util.ArrayList;

import soa.item.material.Material;
import soa.item.material.raw.Mineral;
import soa.space.planet.Planet;

public class PlanetMineral extends Planet {
	Mineral planetElement;
	
	public PlanetMineral(String n, int t, int p, int w, int o, boolean i, Mineral m) {
		super(n, t, p, w, o, i);
		planetElement = m;
		ArrayList<Material> mat = new ArrayList<Material>();
		mat.add(m);
		setResources(mat);
	}


	
}
