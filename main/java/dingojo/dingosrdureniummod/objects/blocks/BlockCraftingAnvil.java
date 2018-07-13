package dingojo.dingosrdureniummod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCraftingAnvil extends BlockBase
{
	public static final AxisAlignedBB CRAFTING_ANVIL_AABB = new AxisAlignedBB(0.0625D, 0, 0, 0.875D, 1D, 1D);

	public BlockCraftingAnvil(String name)
	{
		super(name, Material.ANVIL);
		setSoundType(SoundType.ANVIL);
		setHarvestLevel("pickaxe", 0);
		setResistance(6000F);
		setHardness(5F);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CRAFTING_ANVIL_AABB;
	}
}
