package soa.entity;

import soa.util.Generate;

public class Entity{

	String name;
	int birthUST;
	int age;
	_00Species race;

	public Entity(String n) {
		name = n;
		age = -1;
		race = Generate.race("Unknown");
	}
	public Entity(String n,int a) {
		name = n;
		age = a;
		race = Generate.race("Unknown");
	}
	public Entity(String n,int a,_00Species r) {
		name = n;
		age = a;
		race = r;
	}

	
}
