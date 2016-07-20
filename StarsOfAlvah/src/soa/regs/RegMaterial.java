package soa.regs;

import java.util.ArrayList;

import soa.item.material.Material;

public class RegMaterial {

	private static ArrayList<Material> materials = new ArrayList<Material>();

	public ArrayList<Material> getMaterials(){
		return materials;
	}
	
	public void registerMaterial(Material r){
		if(materials.contains(r));
		else materials.add(r);
	}
}
