
package net.mcreator.killdariamods.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.killdariamods.item.ItemZeroIngot;
import net.mcreator.killdariamods.ElementsKillDaRiaMods;

@ElementsKillDaRiaMods.ModElement.Tag
public class TabKillDaRiaMods extends ElementsKillDaRiaMods.ModElement {
	public TabKillDaRiaMods(ElementsKillDaRiaMods instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabkilldariamods") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemZeroIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
