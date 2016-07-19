package soa.regs;

import java.util.ArrayList;

import soa.station.StationType;

public class RegStationType {

	private static ArrayList<StationType> stationTypes = new ArrayList<StationType>();

	public ArrayList<StationType> getStationTypes(){
		return stationTypes;
	}
	
	public void registerStationType(StationType r){
		if(stationTypes.contains(r));
		else stationTypes.add(r);
	}
}
