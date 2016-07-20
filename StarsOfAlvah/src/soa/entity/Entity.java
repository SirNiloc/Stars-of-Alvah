package soa.entity;

import soa.util.Generate;

public class Entity{

	private String name;
	private int lifePoints=100;
	private int birthUST;
	private int age;
	_00Species race;

	public Entity(String n) {
		setName(n);
		age = -1;
		race = Generate.race("Unknown");
	}
	public Entity(String n,int a) {
		setName(n);
		age = a;
		race = Generate.race("Unknown");
	}
	public Entity(String n,int a,_00Species r) {
		setName(n);
		age = a;
		race = r;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getBUST() {
		return birthUST;
	}
	public _00Species getRace() {
		return race;
	}

	public void setName(String n) {
		name = n;
	}
	
	public int getLifePoints(){
		return lifePoints;
	}
	
	public void setLifePoints(int i){
		lifePoints = i;
	}

	
}
