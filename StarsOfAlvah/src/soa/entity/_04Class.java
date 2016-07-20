package soa.entity;

public class _04Class extends _05Division{
	
	/**
	 * 0: UNKNOWN
	 * 1: Mammalia (Mammal)					D: 1,0
	 * 2: Aves (Bird)						D: 1,0
	 * 3: Reptilia (Reptile)				D: 1,0
	 * 4: Amphibia (Amphibian)				D: 1,0 
	 * 5: Agnatha (Fish)					D: 1,0
	 * 
	 * 6: Crustacea (Shrimp)				D: 2,0
	 * 7: Myriapoda (Milli/Centipede) 		D: 2,0
	 * 8: Arachnida (Spider/Scorpion/Crab)	D: 2,0
	 * 9: Insecta (Winged Bugs)				D: 2,0
	 * 
	 * 10: Asterozoa (Starfish)				D: 3,0
	 * 11: Echinozoa (Sea Urchin/Cucumber)	D: 3,0
	 * 
	 * 12: Anthozoa (Coral/Anemone)			D: 4,0
	 * 13: Scyphozoa (Swimming Jellyfish)	D: 4,0
	 * 14: Cubozoa (Box Jellyfish)			D: 4,0
	 * 15: Hydrozoa (Hydroid/Siphonophores)	D: 4,0
	 * 
	 * 16: Gymnospermopsida (Trees)			D: 5,0
	 * 17: Angiospermopisda (Flowers)		D: 5,0
	 * 18: Sphenopsida (Moss)				D: 5,0
	 * 19: Filicosida (Ferns)				D: 5,0
	 * 
	 * 20: Pucciniomycotina (Rust/leaf)		D: 6,0
	 * 21: Agaricomycotina (Mushroom)		D: 6,0
	 * 22: Ustilaginomycotina (On Food)		D: 6,0
	 * 
	 * 23: Alpha							D: 7,0
	 * 24: Beta								D: 7,0
	 * 25: Gamma							D: 7,0
	 * 26: Delta							D: 7,0
	 * 27: Epsilon							D: 7,0
	 */
	private int clas;

	public void setClass(){
		clas = 0;
		this.setDivision(0);
	}
	
	public void setClass(int i){
		int d = 1;
		clas = i;
		
		if(clas == 0)d=0;
		else if(clas < 6)d=1;
		else if(clas < 10)d=2;
		else if(clas < 12)d=3;
		else if(clas < 16)d=4;
		else if(clas<20)d=5;
		else if(clas<23)d=6;
		else d=7;
		
		this.setDivision(d);
	}
	
	public String getClasss(){
		if(clas == 1)return "Mammalia";
		else if(clas == 2)return "Aves";
		else if(clas == 3)return "Reptilia";
		else if(clas == 4)return "Amphibia";
		else if(clas == 5)return "Agnatha";
		else if(clas == 6)return "Crustacea";
		else if(clas == 7)return "Myriapoda";
		else if(clas == 8)return "Arachnida";
		else if(clas == 9)return "Insecta";
		else if(clas == 10)return "Asterozoa";
		else if(clas == 11)return "Echinozoa";
		else if(clas == 12)return "Anthozoa";
		else if(clas == 13)return "Scyphozoa";
		else if(clas == 14)return "Cubozoa";
		else if(clas == 15)return "Hydrozoa";
		else if(clas == 16)return "Gymnospermopsida";
		else if(clas == 17)return "Angiospermopisda";
		else if(clas == 18)return "Sphenopsida";
		else if(clas == 19)return "Filicosida";
		else if(clas == 20)return "Pucciniomycotina";
		else if(clas == 21)return "Agaricomycotina";
		else if(clas == 22)return "Ustilaginomycotina";
		else if(clas == 23)return "Alphaproteobacteria";
		else if(clas == 24)return "Betaproteobacteria";
		else if(clas == 25)return "Gammaproteobacteria";
		else if(clas == 26)return "Deltaproteobacteria";
		else if(clas == 27)return "Epsilonproteobacteria";
		else return this.getDivision();
	}

}
