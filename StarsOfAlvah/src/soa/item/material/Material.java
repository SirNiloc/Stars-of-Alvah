package soa.item.material;

public class Material {

	private String name;
	private int tier;
	
	private int id = 0;
	private static int idLast = -1;
		
	public Material(String n, int t){
		name = n;
		tier = t;
		id = getNextID();
	}
	
	public int getID(){
		return id;
	}
	public static int getCurrentID(){
		return idLast;
	}
	public static int getNextID(){
		return idLast+1;
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
