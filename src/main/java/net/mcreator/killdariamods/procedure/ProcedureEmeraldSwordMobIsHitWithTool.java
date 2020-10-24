package net.mcreator.killdariamods.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.killdariamods.ElementsKillDaRiaMods;

@ElementsKillDaRiaMods.ModElement.Tag
public class ProcedureEmeraldSwordMobIsHitWithTool extends ElementsKillDaRiaMods.ModElement {
	public ProcedureEmeraldSwordMobIsHitWithTool(ElementsKillDaRiaMods instance) {
		super(instance, 60);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 200, (int) 1));
	}
}
