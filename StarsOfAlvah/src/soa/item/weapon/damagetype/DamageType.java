package soa.item.weapon.damagetype;

public class DamageType {
	
	private String name = "Weapon";
	
	private boolean shieldPen = false;
	
	private double damageModFlesh = 1;
	
	private double damageModArmor = 1;
	
	private double damageModShield = 1;
	
	private double damageModEnergy = 1;
	
	public DamageType(String n, double f, double a, double s, double e, boolean pen){
		name = n;
		shieldPen = pen;
		setDamageMods(f,a,s,e);
	}
	
	private void setDamageMods(double f, double a, double s, double e){
		double points = f+a+s+e;
		
		
		
		double flesh = f/points;
		double armor = a/points;
		double shield = s/points;
		double energy = e/points;
		
		if(shieldPen){
			damageModFlesh = 4*flesh;
			damageModArmor = 4*armor;
			damageModShield = 4*shield;
			damageModEnergy = 4*energy;
			
		}else{
			damageModFlesh = 2*flesh;
			damageModArmor = 2*armor;
			damageModShield = 2*shield;
			damageModEnergy = 2*energy;
		}
		damageModFlesh = Math.floor(damageModFlesh * 100) / 100;
		damageModArmor = Math.floor(damageModArmor * 100) / 100;
		damageModShield = Math.floor(damageModShield * 100) / 100;
		damageModEnergy = Math.floor(damageModEnergy * 100) / 100;
		
	}
	
	public boolean penShield(){
		return shieldPen;
	}
	
	public double getModFlesh(){
		return damageModFlesh;
	}
	
	public double getModArmor(){
		return damageModArmor;
	}
	
	public double getModShield(){
		return damageModShield;
	}
	
	public double getModEnergy(){
		return damageModEnergy;
	}
	
	public String toString(){
		String r = "";
		if(shieldPen)r = "Penetrating ";
		r = r+name+"\nF:"+getModFlesh()+" A:"+getModArmor()+" S:"+getModShield()+" E:"+getModEnergy();
		return r;
	}
}
