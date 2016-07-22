package soa.item.material.raw.gas;

import soa.item.material.raw.MaterialRaw;

public class Gas extends MaterialRaw{

	private int energy;
	private int mind;
	private int body;
	private int spirit;
	
	public Gas(String n, int t, boolean d, long ammount, int e,int m,int b,int s) {
		super(n, t, d, ammount);
		energy = e;
		mind = m;
		body = b;
		spirit = s;
	}
	
	public int getEnergy(){
		return energy;
	}
	
	public int getMind(){
		return mind;
	}
	public int getBody(){
		return body;
	}
	public int getSpirit(){
		return spirit;
	}

}
