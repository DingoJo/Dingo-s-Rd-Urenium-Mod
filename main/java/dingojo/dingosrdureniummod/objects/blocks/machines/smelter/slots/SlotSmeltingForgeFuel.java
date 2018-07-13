package dingojo.dingosrdureniummod.objects.blocks.machines.smelter.slots;

import dingojo.dingosrdureniummod.objects.blocks.machines.smelter.TileEntitySmeltingForge;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSmeltingForgeFuel extends Slot
{
	public SlotSmeltingForgeFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntitySmeltingForge.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}