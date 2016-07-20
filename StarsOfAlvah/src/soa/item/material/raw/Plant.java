package soa.item.material.raw;

public class Plant extends MaterialRaw{

	int growAmmount;
	int growTime;
	
	public Plant(String n, int t,boolean d, int ga, int gt) {
		super(n, t,d);
		growAmmount = ga;
		growTime = gt;
	}


}
