
package net.mcreator.killdariamods.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.killdariamods.ElementsKillDaRiaMods;

import java.util.Set;
import java.util.HashMap;

@ElementsKillDaRiaMods.ModElement.Tag
public class ItemDariaHoe extends ElementsKillDaRiaMods.ModElement {
	@GameRegistry.ObjectHolder("killdariamods:dariahoe")
	public static final Item block = null;
	public ItemDariaHoe(ElementsKillDaRiaMods instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("DARIAHOE", 2, 323, 7f, 0f, 17)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("dariahoe").setRegistryName("dariahoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("killdariamods:dariahoe", "inventory"));
	}
}
