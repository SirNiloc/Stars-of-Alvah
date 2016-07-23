package soa.regs;

import java.util.ArrayList;

import soa.space.ship.type.ShipType;

public class RegShipType {

	private static ArrayList<ShipType> shipTypes = new ArrayList<ShipType>();

	public ArrayList<ShipType> getShipTypes(){
		return shipTypes;
	}
	
	public void registerShipType(ShipType r){
		if(shipTypes.contains(r));
		else shipTypes.add(r);
	}
}
