package soa.regs;

import soa.item.material.Material;

public class RegMaterials{

	private static Materials r = new Materials();
	
	
	private static int idLast = -1;

	public static int getCurrentID(){
		return idLast;
	}
	public static int getNextID(){
		return idLast+1;
	}
	
	public static Material getIndex(int i){
		return r.getMaterials().get(i);
	}
	
	public static Materials getReg(){
		return r;
	}
	
	public static void register(Material m){
		if(r.add(m, 1)) idLast = getNextID();
		System.out.println(getNextID());
	}
	
	
}
