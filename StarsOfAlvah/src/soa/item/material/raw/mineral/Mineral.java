package soa.item.material.raw.mineral;

import soa.item.material.raw.MaterialRaw;

public class Mineral extends MaterialRaw{

	int strength;
	int magic;
	
	int alpha;
	int red;
	int green;
	int blue;
	
	public Mineral(String n, int t, boolean d, int str,int m,int r,int g, int b,int a) {
		super(n, t, d);
		strength = str;
		magic = m;
		red = r;
		green = g;
		blue = b;
		alpha = a;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getMagic(){
		return magic;
	}
	
	public int getAlpha(){
		return alpha;
	}
	
	public int getRed(){
		return red;
	}
	public int getGreen(){
		return green;
	}
	
	public int getBlue(){
		return blue;
	}

}
