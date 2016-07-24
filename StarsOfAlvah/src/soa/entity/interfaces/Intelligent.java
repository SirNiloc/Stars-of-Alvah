package soa.entity.interfaces;

public interface Intelligent {
	
    void gainExp(int e);
    void checkEXP();    
    void levelUp(int e); 
    
    void setLevel(int l);
    void setEXP(int e);
    
    int getLevel();
    int getEXP();
    
    int getPoints();
    void setPoints(int p);
}
