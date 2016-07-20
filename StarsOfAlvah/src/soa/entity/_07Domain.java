package soa.entity;

public class _07Domain {

	/**
	 * 0: UNKNOWN
	 * 1: Eukarya
	 * 2: Bacteria
	 */
	private int domain;
	
	public void setDomain(int i){
		domain = i;
	}
	
	public String getDomain(){
		if(domain == 1)return "Eukarya";
		else if(domain == 2)return "Bacteria";
		else return "UNKNOWN";
	}
}
