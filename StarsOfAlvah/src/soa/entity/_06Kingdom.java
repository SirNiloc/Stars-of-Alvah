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
		
		int m=0,b=0,s=0;
		if(i==1){
			m=350;
			b=325;
			s=325;
		}else if(i==2){
			m=10;
			b=900;
			s=90;
		}else if(i==3){
			m=10;
			b=90;
			s=900;
		}else if(i==4){
			m=10;
			b=500;
			s=490;
		}else{
			s=1000;
		}
			
		addMind(m);
		addBody(b);
		addSpirit(s);
	}
	
	public String getKingdom(){
		if(kingdom == 1)return "Animalia";
		else if(kingdom == 2)return "Bacteria";
		else if(kingdom == 3)return "Fungi";
		else if(kingdom == 4)return "Plantae";
		else return this.getDomain();
	}
}
