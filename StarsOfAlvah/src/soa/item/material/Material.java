package soa.item.material;

public class Material {

	private String name;
	private int tier;
	private int points;
	
	public Material(String n, int t){
		name = n;
		tier = t;
		points = t*t*10;
	}
	
	public Material(String n, int t, int pb){
		name = n;
		tier = t;
		points = pb+(t*t*10);
	}
	
	public String getName(){
		return name;
	}
	
	public int getPoints(){
		return points;
	}
	
	public int getTier(){
		return tier;
	}
}
