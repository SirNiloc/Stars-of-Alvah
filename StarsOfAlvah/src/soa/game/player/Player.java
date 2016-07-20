package soa.game.player;

import soa.entity.IntelligentEntity;
import soa.entity._00Species;

public class Player extends IntelligentEntity{

	public Player(String s, int age, _00Species race) {
		super(s, age, race);
	}

	public String toString(){
		_00Species race = this.getRace();
		return "Name: "+this.getName()+"\n"+
				"Age: "+this.getAge()+"\n"+
				"Species: "+race.getSpecies()+"\n"+
				"Genus: "+race.getGenus()+"\n"+
				"Family: "+race.getFamily()+"\n"+
				"Order: "+race.getOrder(race.getSpecies())+"\n"+
				"Class: "+race.getClasss(race.getSpecies())+"\n"+
				"Division: "+race.getDivision(race.getSpecies())+"\n"+
				"Kingdom: "+race.getKingdom(race.getSpecies())+"\n"+
				"Domain: "+race.getDomain(race.getSpecies())+"\n"+
				"Body: "+race.getBody()+"\n"+
				"Mind: "+race.getMind()+"\n"+
				"Spirit: "+race.getSpirit()+"\n";
	}
	
	//TODO Add Characteristics
}
