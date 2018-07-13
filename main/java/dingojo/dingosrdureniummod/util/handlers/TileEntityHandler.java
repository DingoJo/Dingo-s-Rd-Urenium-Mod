package dingojo.dingosrdureniummod.util.handlers;

import dingojo.dingosrdureniummod.objects.blocks.machines.smelter.TileEntitySmeltingForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySmeltingForge.class, "smelting_forge");
	}
}
