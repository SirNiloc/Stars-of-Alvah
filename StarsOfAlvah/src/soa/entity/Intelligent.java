package soa.entity;

public interface Intelligent {

	int level = 0;
	int exp = 0;
	int complexity = 0;
	
    void gainExp(int e);
    void checkEXP();    
    boolean levelUp(); 
    void setLevel(int l);
    void setEXP(int e);
    int getLevel();
    int getEXP();
    int getComplexity();
}
