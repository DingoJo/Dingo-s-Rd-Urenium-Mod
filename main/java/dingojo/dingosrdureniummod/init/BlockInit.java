package dingojo.dingosrdureniummod.init;

import java.util.ArrayList;
import java.util.List;

import dingojo.dingosrdureniummod.objects.blocks.BlockCraftingAnvil;
import dingojo.dingosrdureniummod.objects.blocks.BlockOres;
import dingojo.dingosrdureniummod.objects.blocks.machines.smelter.BlockSmeltingForge;
import net.minecraft.block.Block;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	public static final Block SMELTING_FORGE = new BlockSmeltingForge("smelting_forge");
	public static final Block CRAFTING_ANVIL = new BlockCraftingAnvil("crafting_anvil");
}
