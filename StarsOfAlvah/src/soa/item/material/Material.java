package soa.item.material;

public class Material {

	private String name;
	private int tier;
	
	public Material(String n, int t){
		name = n;
		tier = t;
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
