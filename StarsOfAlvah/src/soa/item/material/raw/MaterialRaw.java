package soa.item.material.raw;

import soa.item.material.Material;

public class MaterialRaw extends Material{

	boolean destroyOnHarvest = true;
	
	public MaterialRaw(String n, int t, boolean d) {
		super(n, t);
		destroyOnHarvest = d;
	}

}
