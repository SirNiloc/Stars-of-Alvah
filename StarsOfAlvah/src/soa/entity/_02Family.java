package soa.entity;

public class _02Family extends _03Order{

	private String family = "FAMILY";

	public _02Family(String spec,int i){
		setFamily(spec);
		setClass(i);
	}
	
	public _02Family(String spec, int i, String s){
		setFamily(s);
		setClass(i);
	}
	
	public void setFamily(String spec){
		family = this.getOrder(spec);
		if (family.length() > 6) {
			family = family.substring(0, family.length()-6)+"ae";
		}
	}
	public void setFamily(String spec,String s){
		family = s;
	}

	
	public String getFamily(){
		return family;
	}
}
