package soa.regs;

import soa.item.material.Material;

public class RegMaterials{

	private static Materials r = new Materials();
	
	public static Materials getReg(){
		return r;
	}
	
	public static void register(Material m){
		r.add(m, 1);
	}
	
	
}
