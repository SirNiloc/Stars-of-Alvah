package soa.entity;

public class _00Species extends _01Genus{
	
	private String species;
	
	

	public _00Species(String spec, int clas) {
		super(spec,clas);
		setSpecies(spec);
		setGenus();
	}
	public _00Species(String spec,int clas, String family) {
		super(spec,clas,family);
		setSpecies(spec);
		setGenus();
	}

	public _00Species(String spec,int clas, String family, String genus) {
		super(spec,clas,family);
		setGenus(genus);
		setSpecies(spec);
	}
	
	public void setSpecies(String s){
		species = this.getGenus()+" "+s;
	}
	
	public String getSpecies(){
		return species;
	}
	

}
