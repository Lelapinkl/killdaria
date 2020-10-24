
package net.mcreator.killdariamods.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.killdariamods.item.ItemZeroIngot;
import net.mcreator.killdariamods.block.BlockZeroOre;
import net.mcreator.killdariamods.ElementsKillDaRiaMods;

@ElementsKillDaRiaMods.ModElement.Tag
public class RecipeZeroOreSmelting extends ElementsKillDaRiaMods.ModElement {
	public RecipeZeroOreSmelting(ElementsKillDaRiaMods instance) {
		super(instance, 23);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockZeroOre.block, (int) (1)), new ItemStack(ItemZeroIngot.block, (int) (1)), 1F);
	}
}
