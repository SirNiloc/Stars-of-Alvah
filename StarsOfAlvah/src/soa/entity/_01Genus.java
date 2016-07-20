package soa.entity;

public class _01Genus extends _02Family{




	private String genus = "UNKNOWN";
	
	public _01Genus(int i) {
		super(i);
	}
	public _01Genus(int i, String s) {
		super(i,s);
	}
	
	public _01Genus(int i, String s,boolean noGenus) {
		super(i,s);
		setGenus();
	}

	public _01Genus(int i, String s, String s2) {
		super(i,s);
		setGenus(s2);
	}
	
	public void setGenus(){
		genus = this.getFamily();
		if (genus.length() > 2) {
			genus = genus.substring(0, genus.length()-2)+"o";
		}
	}
	public void setGenus(String s){
		genus = s;
	}
	
	
	public String getGenus(){
		return genus;
	}
}
