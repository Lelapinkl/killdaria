
package net.mcreator.killdariamods.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.killdariamods.ElementsKillDaRiaMods;

import java.util.Set;
import java.util.HashMap;

@ElementsKillDaRiaMods.ModElement.Tag
public class ItemEmeraldPickaxe extends ElementsKillDaRiaMods.ModElement {
	@GameRegistry.ObjectHolder("killdariamods:emeraldpickaxe")
	public static final Item block = null;
	public ItemEmeraldPickaxe(ElementsKillDaRiaMods instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("EMERALDPICKAXE", 2, 250, 6f, -2f, 14)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("emeraldpickaxe").setRegistryName("emeraldpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("killdariamods:emeraldpickaxe", "inventory"));
	}
}
