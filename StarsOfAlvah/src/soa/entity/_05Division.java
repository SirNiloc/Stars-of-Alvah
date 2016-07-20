package soa.entity;

public class _05Division extends _06Kingdom{



	/**
	 * 0: UNKNOWN
	 * 1: Chordata (Spines)			K: 1,0
	 * 2: Arthropoda (Insect)		K: 1,0
	 * 3: Echinodermata (Starfish)	K: 1,0
	 * 4: Cnidaria (Jellyfish)		K: 1,0
	 * 
	 * 5: Tracheophyta (Tree)		K: 4,0
	 * 
	 * 6: Basidiomycota (Mushroom)	K: 3,0
	 * 
	 * 7: Proteobacteria (Bacteria) K: 2,0
	 */
	private int division;

	public void setDivision(int i){
		int k=1;
		division = i;
		
		if(division == 7)k=2;
		else if(division == 6)k=3;
		else if(division == 5)k=4;
		else if(division == 0)k=0;
			
		this.setKingdom(k);
	}
	
	public String getDivision(){
		if(division == 1)return "Chordata";
		else if(division == 2)return "Arthropoda";
		else if(division == 3)return "Echinodermata";
		else if(division == 4)return "Cnidaria";
		else if(division == 5)return "Tracheophyta";
		else if(division == 6)return "Basidiomycota";
		else if(division == 7)return "Proteobacteria";
		else return this.getKingdom();
	}

}
