package soa.regs;

import java.util.ArrayList;

import soa.game.player.PlayerSheet;

public class RegPlayerSheets {

	private static ArrayList<PlayerSheet> playerSheets = new ArrayList<PlayerSheet>();

	public ArrayList<PlayerSheet> getPlayerSheets(){
		return playerSheets;
	}
	
	public void registerPlayerSheet(PlayerSheet r){
		if(playerSheets.contains(r));
		else playerSheets.add(r);
	}
}
