package soa.game.player;

public class PlayerSheet {

	String name = "Character Overview";
	String info = "EMPTY";
	Player player;
	//TODO Add Characteristics
	
	public PlayerSheet(Player p){
		player = p;
		name = "Character Overview";
	}
	
	public PlayerSheet(Player p, String n){
		player = p;
		name = n;
	}
	
	public String getName(){
		return name;
	}

	public String getSheetInfo() {
		// TODO Auto-generated method stub
		return info;
	}
}
