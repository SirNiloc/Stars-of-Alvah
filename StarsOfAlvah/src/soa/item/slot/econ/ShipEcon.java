package soa.item.slot.econ;

import soa.item.slot.Slot;

public class ShipEcon  implements Slot {

	private int slotLevel = 0;
	@Override
	public int getSlotCost() {
		return slotLevel;
	}
}
