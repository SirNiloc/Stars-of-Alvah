package soa.space.planet.types.gas;

import java.util.ArrayList;

import soa.item.material.Material;
import soa.item.material.raw.gas.Gas;
import soa.space.planet.Planet;

public class PlanetGas extends Planet {

	public PlanetGas(String n, int t, int p, int w, int o, boolean i, ArrayList<Gas> m) {
		super(n, t, p, w, o, i);
		ArrayList<Material> mat = new ArrayList<Material>();
		for(Gas g : m){
			mat.add(g);
		}
		setResources(mat);
	}
		
	

}
