package soa.util;

import soa.entity._00Species;

public class Generate {
	
	public static _00Species race(String species){
		return new _00Species(species, (int)(Math.random() * ((27) + 1)));
	}
	public static _00Species race(String species,String family){
		return new _00Species(species, (int)(Math.random() * ((27) + 1)), family);
	}
	public static _00Species race(String species,String family, String genus){
		return race(species,(int)(Math.random() * ((27) + 1)),family,genus);
	}
	public static _00Species race(String species,int c, String family, String genus){
		return new _00Species(species, c, family, genus);
		
	}
}
