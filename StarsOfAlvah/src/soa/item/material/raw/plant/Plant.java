package soa.item.material.raw.plant;

import soa.item.material.raw.MaterialRaw;

public class Plant extends MaterialRaw{

	int growAmmount;
	int growTime;
	
	public Plant(String n, int t,boolean d,long ammount, int ga, int gt) {
		super(n, t,d,ammount);
		growAmmount = ga;
		growTime = gt;
	}

	public int getGA(){
		return growAmmount;
	}
	
	public int getGT(){
		return growTime;
	}

}
