package soa.entity;

public class _06Kingdom extends _07Domain{



	/**
	 * 0: UNKNOWN
	 * 1: Animalia	D: 1,0
	 * 2: Bacteria	D: 2,0
	 * 3: Fungi		D: 1,0
	 * 4: Plantae	D: 1,0
	 */
	private int kingdom;
	
	public void setKingdom(int i) {
		int d = 0;
		kingdom = i;
		
		if(kingdom == 2) d=2;
		else if(kingdom != 0)d=1;		
		this.setDomain(d);
	}
	
	public String getKingdom(){
		if(kingdom == 1)return "Animalia";
		else if(kingdom == 2)return "Bacteria";
		else if(kingdom == 3)return "Fungi";
		else if(kingdom == 4)return "Plantae";
		else return this.getDomain();
	}
}
