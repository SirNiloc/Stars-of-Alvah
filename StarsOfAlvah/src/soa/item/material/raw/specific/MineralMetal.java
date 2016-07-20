package soa.item.material.raw.specific;

import soa.item.material.raw.Mineral;

public class MineralMetal extends Mineral{

	int conductivity;
	
	public MineralMetal(String n, int t, boolean d, int str, int m, int r,int g, int b,int conduct) {
		super(n, t, d, str, m, r, g, b,255);
		conductivity = conduct;
	}

}
