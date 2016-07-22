package soa.item.material;

public class Material {

	private String name;
	private int tier;
	private long ammount = 0;
	
	public Material(String n, int t, long ammount){
		name = n;
		tier = t;
	}
	
	public long getAmmount(){
		return ammount;
	}
	
	public String getName(){
		return name;
	}
		
	public int getTier(){
		return tier;
	}
	
	public int getPoints(){
		return tier*tier*10;
	}
	
	public static int getPoints(int t){
		return t*100;
	}
}
