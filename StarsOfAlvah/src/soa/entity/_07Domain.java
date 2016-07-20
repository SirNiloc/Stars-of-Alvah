package soa.entity;

public class _07Domain {

	/**
	 * 0: UNKNOWN
	 * 1: Eukarya
	 * 2: Bacteria
	 */
	
	private int levelMind=0;
	private int levelBody=0;
	private int levelSpirit=0;
	
	private int domain;
	
	public void setDomain(int i){
		int m=0,b=0,s=0;
		domain = i;
		if(i==1)m = 1000;
		else if(i==2)b=1000;
		else s=1000;
		
		addMind(m);
		addBody(b);
		addSpirit(s);
	}

	public void addMind(int i){
		setMind(getMind()+i);
	}
	public void addBody(int i){
		setBody(getBody()+i);
	}
	public void addSpirit(int i){
		setSpirit(getSpirit()+i);
	}
	
	private void setMind(int i){
		levelMind = i;
	}
	private void setBody(int i){
		levelBody = i;
	}
	private void setSpirit(int i){
		levelSpirit = i;
	}
	
	public int getMind(){
		return levelMind;
	}
	public int getBody(){
		return levelBody;
	}
	public int getSpirit(){
		return levelSpirit;
	}
	
	public String getDomain(String spec){
		if(domain == 1)return "Eukarya";
		else if(domain == 2)return "Bacteria";
		else return spec;
	}
}
