package soa.item.slot.logistics;

import soa.item.slot.Slot;

public class ShipLogistics implements Slot {

	private int slotLevel = 0;
	@Override
	public int getSlotCost() {
		return slotLevel;
	}
}
