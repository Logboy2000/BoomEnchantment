package logboy2000.boomenchantment.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class BoomEnchantment extends Enchantment {
    public BoomEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ServerWorld world = (ServerWorld) user.getWorld();
            world.createExplosion(target, target.getX(), target.getY(), target.getZ(), level, World.ExplosionSourceType.TNT);
        }
        super.onTargetDamaged(user, target, level);
    }
}