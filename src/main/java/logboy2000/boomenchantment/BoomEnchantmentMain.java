package logboy2000.boomenchantment;

import net.fabricmc.api.ModInitializer;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoomEnchantmentMain implements ModInitializer {
	public static final String MOD_ID = "boomenchantment";
    public static final Logger LOGGER = LoggerFactory.getLogger("boomenchantment");
	public static Enchantment BOOM = new BoomEnchantment();

	@Override
	public void onInitialize() {
		Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "boom"), BOOM);
	}
}