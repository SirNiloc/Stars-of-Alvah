package soa.item.slot.sci;

import soa.item.slot.Slot;

public class ShipScience  implements Slot {

	private int slotLevel = 0;
	@Override
	public int getSlotCost() {
		return slotLevel;
	}

}
