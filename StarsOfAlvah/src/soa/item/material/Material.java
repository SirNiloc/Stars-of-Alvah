package soa.item.material;

public class Material {

	private String name;
	private int tier;
	
	private int id = 0;
		
	public Material(String n, int t){
		name = n;
		tier = t;
	}
	
	public int getID(){
		return id;
	}
	public void setID(int i){
		id = i;
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
