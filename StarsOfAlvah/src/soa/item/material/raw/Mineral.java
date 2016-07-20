package soa.item.material.raw;

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

}
