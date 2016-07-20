package soa.entity;

import soa.entity.interfaces.Intelligent;

public class IntelligentEntity extends Entity  implements Intelligent{

	private int level = 0;
	private int exp = 0;
	private int points = 0;
	
	public IntelligentEntity(String n, int a, _00Species r) {
		super(n, a, r);
	}

	@Override
	public void gainExp(int e) {
		setEXP(exp+e);
		checkEXP();
	}

	@Override
	public void checkEXP() {
		int nextLevel = (getLevel()+10)*(5+getLevel());
		if(getEXP() >= nextLevel)levelUp(nextLevel);
	}

	@Override
	public void levelUp(int e) {
		setLevel(level+1);
		setEXP(exp-e);
		setPoints(getPoints()+1);
	}

	@Override
	public void setLevel(int l) {
		for(int i = level; i <= l;i++){
			levelUp(0);
		}
		for(int i = level; i >= l;i--){
			setLevel(level-1);
			setEXP(0);
			setPoints(getPoints()-1);
		}
		level = l;
		setEXP(0);
	}

	@Override
	public void setEXP(int e) {
		exp=e;
		checkEXP();
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public int getEXP() {
		return exp;
	}

	
	@Override
	public int getPoints() {
		return points;
	}
	

	@Override
	public void setPoints(int p) {
		points = p;
	}


}
