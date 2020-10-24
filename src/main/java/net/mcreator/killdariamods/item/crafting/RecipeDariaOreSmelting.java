
package net.mcreator.killdariamods.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.killdariamods.ElementsKillDaRiaMods;

@ElementsKillDaRiaMods.ModElement.Tag
public class RecipeDariaOreSmelting extends ElementsKillDaRiaMods.ModElement {
	public RecipeDariaOreSmelting(ElementsKillDaRiaMods instance) {
		super(instance, 29);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, (int) (1), 2), new ItemStack(Blocks.AIR, (int) (1)), 0.8400000000000001F);
	}
}
