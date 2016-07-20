package soa.entity;

public class _02Family extends _03Order{

	private String family = "UNKNOWN";

	public _02Family(int i){
		setFamily();
		setClass(i);
	}
	
	public _02Family(int i, String s){
		setFamily(s);
		setClass(i);
	}
	
	public void setFamily(){
		family = this.getOrder();
		if (family.length() > 6) {
			family = family.substring(0, family.length()-6)+"ae";
		}
	}
	public void setFamily(String s){
		family = s;
	}

	
	public String getFamily(){
		return family;
	}
}
