package soa.space.planet.types.solid;

import java.util.ArrayList;

import soa.item.material.Material;
import soa.item.material.raw.mineral.Mineral;
import soa.space.planet.Planet;

public class PlanetMineral extends Planet {

	public PlanetMineral(String n, int t, int p, int w, int o, boolean i, ArrayList<Mineral> m) {
		super(n, t, p, w, o, i);
		ArrayList<Material> mat = new ArrayList<Material>();
		for(Mineral g : m){
			mat.add(g);
		}
		setResources(mat);
	}


	
}
