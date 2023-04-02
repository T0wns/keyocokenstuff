package net.cringeco.keyocokenstuff.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.cringeco.keyocokenstuff.KeyocokenstuffMod;

import java.util.Map;

public class VinegarOnPlayerStoppedUsingProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				KeyocokenstuffMod.LOGGER.warn("Failed to load dependency entity for procedure VinegarOnPlayerStoppedUsing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.hurt(DamageSource.GENERIC, 4);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 600, 10, (false), (false)));
	}
}
