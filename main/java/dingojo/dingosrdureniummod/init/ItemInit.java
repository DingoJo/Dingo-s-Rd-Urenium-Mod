package dingojo.dingosrdureniummod.init;

import java.util.ArrayList;
import java.util.List;

import dingojo.dingosrdureniummod.objects.items.ItemBase;
import dingojo.dingosrdureniummod.objects.tools.CloudSword;
import dingojo.dingosrdureniummod.objects.tools.MeteorSword;
import dingojo.dingosrdureniummod.objects.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials - name, harvestLevel, maxUses, efficiency, damage, enchantability
	/*WOOD(0, 59, 2.0F, 0.0F, 15),
	STONE(1, 131, 4.0F, 1.0F, 5),
	IRON(2, 250, 6.0F, 2.0F, 14),
	DIAMOND(3, 1561, 8.0F, 3.0F, 10),
	GOLD(0, 32, 12.0F, 0.0F, 22);*/
	public static final ToolMaterial TOOL_JANK = EnumHelper.addToolMaterial("tool_jank", 2, 500, 6.0F, 2.5F, 14);
	public static final ToolMaterial TOOL_URENIUM = EnumHelper.addToolMaterial("tool_urenium", 4, 1964, 9.0F, 5.0F, 10);
	
	
	//Items
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
	public static final Item URENIUM_INFUSED_OBSIDIAN = new ItemBase("urenium_infused_obsidian");
	
	public static final Item HANDLE_URENIUM = new ItemBase("handle_urenium");
	public static final Item BLADE_URENIUM = new ItemBase("blade_urenium");
	
	//Tools
	public static final Item SWORD_JANK = new ToolSword("sword_jank", TOOL_JANK);
	public static final Item SWORD_URENIUM = new ToolSword("sword_urenium", TOOL_URENIUM);
}